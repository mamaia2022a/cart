package com.potsoft.cart2api.service.impl;


import com.potsoft.cart2api.service.HttpClientService;

import org.springframework.stereotype.Service;
import org.apache.commons.lang3.StringUtils;
//import org.junit.Test;

import java.io.*;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.net.URLEncoder;

//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//import org.junit.After;
//import org.junit.BeforeClass;
//import org.junit.Test;

import javax.xml.bind.DatatypeConverter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

//import static org.junit.Assert.assertTrue;

import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.StandardCopyOption;
//import java.util.concurrent.ExecutionException;

//import java.io.*;
import java.net.*;



import org.apache.commons.io.FileUtils;
//import org.asynchttpclient.*;


@Service
public class HttpClientServiceImpl implements HttpClientService 
{
	@Override
    public int download_file(String url, String localFilename) 
	{
        try (BufferedInputStream in = new BufferedInputStream(new URL(url).openStream()); 
		     FileOutputStream fileOutputStream = new FileOutputStream(localFilename)) {

            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
			in.close();
			fileOutputStream.close();
			return 0;
        } catch (IOException e) {
            e.printStackTrace();
			return 1;
        }
    }

	
	//@Test
	public void whenGetRequest_thenOk() throws IOException {
		URL url = new URL("http://example.com");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");

		Map<String, String> parameters = new HashMap<>();
		parameters.put("param1", "val");
		con.setDoOutput(true);
		DataOutputStream out = new DataOutputStream(con.getOutputStream());
		out.writeBytes(getParamsString(parameters));
		out.flush();
		out.close();

		con.setConnectTimeout(5000);
		con.setReadTimeout(5000);

		int status = con.getResponseCode();
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuilder content = new StringBuilder();
		while ((inputLine = in.readLine()) != null) {
			content.append(inputLine);
		}
		in.close();
        System.out.println(status);
		//assertEquals("status code incorrect", status, 200);
		//assertTrue("content incorrect", content.toString()
		//	.contains("Example Domain"));
	}

	//@Test
	public void whenPostRequest_thenOk() throws IOException {
		URL url = new URL("http://example.com");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("Content-Type", "application/json");

		Map<String, String> parameters = new HashMap<>();
		parameters.put("param1", "val");
		con.setDoOutput(true);
		DataOutputStream out = new DataOutputStream(con.getOutputStream());
		out.writeBytes(getParamsString(parameters));
		out.flush();
		out.close();

		int status = con.getResponseCode();
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuilder content = new StringBuilder();
		while ((inputLine = in.readLine()) != null) {
			content.append(inputLine);
		}
		in.close();
        System.out.println(status);
		//assertEquals("status code incorrect", status, 200);
	}

	//@Test
	public void whenGetCookies_thenOk() throws IOException {
		URL url = new URL("http://example.com");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");

		CookieManager cookieManager = new CookieManager();
		String cookiesHeader = con.getHeaderField("Set-Cookie");
		Optional<HttpCookie> usernameCookie = null;
		if (cookiesHeader != null) {
			List<HttpCookie> cookies = HttpCookie.parse(cookiesHeader);
			cookies.forEach(cookie -> cookieManager.getCookieStore()
				.add(null, cookie));
			usernameCookie = cookies.stream()
				.findAny()
				.filter(cookie -> cookie.getName()
					.equals("username"));
		}

		if (usernameCookie == null) {
			cookieManager.getCookieStore()
				.add(null, new HttpCookie("username", "john"));
		}

		con.disconnect();

		con = (HttpURLConnection) url.openConnection();
		con.setRequestProperty("Cookie", StringUtils.join(cookieManager.getCookieStore()
			.getCookies(), ";"));

		int status = con.getResponseCode();
        System.out.println(status);
		//assertEquals("status code incorrect", status, 200);
	}

	//@Test
	public void whenRedirect_thenOk() throws IOException {
		URL url = new URL("http://example.com");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");

		con.setInstanceFollowRedirects(true);
		int status = con.getResponseCode();

		if (status == HttpURLConnection.HTTP_MOVED_TEMP || status == HttpURLConnection.HTTP_MOVED_PERM) {
			String location = con.getHeaderField("Location");
			URL newUrl = new URL(location);
			con = (HttpURLConnection) newUrl.openConnection();
		}

		//assertEquals("status code incorrect", con.getResponseCode(), 200);
	}

	//@Test
	public void whenFailedRequest_thenOk() throws IOException {
		URL url = new URL("http://example.com");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("POST");

		con.setConnectTimeout(5000);
		con.setReadTimeout(5000);

		int status = con.getResponseCode();

		Reader streamReader = null;

		if (status > 299) {
			streamReader = new InputStreamReader(con.getErrorStream());
		} else {
			streamReader = new InputStreamReader(con.getInputStream());
		}

		BufferedReader in = new BufferedReader(streamReader);
		String inputLine;
		StringBuilder content = new StringBuilder();
		while ((inputLine = in.readLine()) != null) {
			content.append(inputLine);
		}
		in.close();

		con.disconnect();

		//assertEquals("status code incorrect", status, 411);
		//assertTrue("error content", content.toString()
		//	.contains("411 - Length Required"));
	}

	//@Test
	public void whenGetRequestFullResponse_thenOk() throws IOException {
		URL url = new URL("http://example.com");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");

		con.setConnectTimeout(5000);
		con.setReadTimeout(5000);

		String fullResponse = getFullResponse(con);
        System.out.println(fullResponse);
		con.disconnect();

		//assertEquals("status code incorrect", con.getResponseCode(), 200);
		//assertTrue("header incorrect", fullResponse.contains("Content-Type: text/html; charset=UTF-8"));
		//assertTrue("response incorrect", fullResponse.contains("<!doctype html><html><head>"));
	}
	

	public static String getParamsString(Map<String, String> params) throws UnsupportedEncodingException {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            result.append("=");
            result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            result.append("&");
        }
        String resultString = result.toString();
        return resultString.length() > 0 ? resultString.substring(0, resultString.length() - 1) : resultString;
    }

	public static String getFullResponse(HttpURLConnection con) throws IOException {
        StringBuilder fullResponseBuilder = new StringBuilder();

        fullResponseBuilder.append(con.getResponseCode())
            .append(" ")
            .append(con.getResponseMessage())
            .append("\n");

        con.getHeaderFields()
            .entrySet()
            .stream()
            .filter(entry -> entry.getKey() != null)
            .forEach(entry -> {

                fullResponseBuilder.append(entry.getKey())
                    .append(": ");

                List<String> headerValues = entry.getValue();
                Iterator<String> it = headerValues.iterator();
                if (it.hasNext()) {
                    fullResponseBuilder.append(it.next());

                    while (it.hasNext()) {
                        fullResponseBuilder.append(", ")
                            .append(it.next());
                    }
                }

                fullResponseBuilder.append("\n");
            });

        Reader streamReader = null;

        if (con.getResponseCode() > 299) {
            streamReader = new InputStreamReader(con.getErrorStream());
        } else {
            streamReader = new InputStreamReader(con.getInputStream());
        }

        BufferedReader in = new BufferedReader(streamReader);
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }

        in.close();

        fullResponseBuilder.append("Response: ")
            .append(content);

        return fullResponseBuilder.toString();
    }

    
    
    //@Test
    public void givenJavaIO_whenDownloadingFile_thenDownloadShouldBeCorrect() throws NoSuchAlgorithmException, IOException {
        
        downloadWithJavaIO(FILE_URL, FILE_NAME);
        //assertTrue(checkMd5Hash(FILE_NAME));
    }
    
    //@Test
    public void givenJavaNIO_whenDownloadingFile_thenDownloadShouldBeCorrect() throws NoSuchAlgorithmException, IOException {
        
        downloadWithJavaNIO(FILE_URL, FILE_NAME);
        //assertTrue(checkMd5Hash(FILE_NAME));
    }
    
    //@Test
    public void givenJava7IO_whenDownloadingFile_thenDownloadShouldBeCorrect() throws NoSuchAlgorithmException, IOException {
        
        downloadWithJava7IO(FILE_URL, FILE_NAME);
        //assertTrue(checkMd5Hash(FILE_NAME));
    }
    
    //@Test
    public void givenAHCLibrary_whenDownloadingFile_thenDownloadShouldBeCorrect() throws NoSuchAlgorithmException, IOException, ExecutionException, InterruptedException {
        
        //downloadWithAHC(FILE_URL, FILE_NAME);
        //assertTrue(checkMd5Hash(FILE_NAME));
    }
    
    //@Test
    public void givenApacheCommonsIO_whenDownloadingFile_thenDownloadShouldBeCorrect() throws NoSuchAlgorithmException, IOException {
        
        downloadWithApacheCommons(FILE_URL, FILE_NAME);
        //assertTrue(checkMd5Hash(FILE_NAME));
    }
    
    //@Test
    public void givenJavaIO_whenDownloadingFileStops_thenDownloadShouldBeResumedCorrectly() throws NoSuchAlgorithmException, IOException, URISyntaxException {
        
        downloadFileWithResume(FILE_URL, FILE_NAME);
        //assertTrue(checkMd5Hash(FILE_NAME));
		checkMd5Hash(FILE_NAME);
    }

   
    private boolean checkMd5Hash(String filename) throws IOException, NoSuchAlgorithmException {
        
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(Files.readAllBytes(Paths.get(filename)));
        byte[] digest = md.digest();
        String myChecksum = DatatypeConverter.printHexBinary(digest);
        
        return myChecksum.equalsIgnoreCase(FILE_MD5_HASH);
    }
    
    //@BeforeClass
    public static void setup() throws IOException {
        if (Files.exists(Paths.get(FILE_NAME))) {
            Files.delete(Paths.get(FILE_NAME));
        }
    }
    
    //@After
    public void cleanup() throws IOException {
        if (Files.exists(Paths.get(FILE_NAME))) {
            Files.delete(Paths.get(FILE_NAME));
        }
    }

    static String FILE_URL = "https://s3.amazonaws.com/baeldung.com/Do+JSON+with+Jackson.pdf?__s=vatuzcrazsqopnn7finb";
    static String FILE_NAME = "file.dat";
    static String FILE_MD5_HASH = "CE20E17B1E1FBF65A85E74AC00FA1FD8";


    public static void downloadWithJavaIO(String url, String localFilename) {

        try (BufferedInputStream in = new BufferedInputStream(new URL(url).openStream()); FileOutputStream fileOutputStream = new FileOutputStream(localFilename)) {

            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void downloadWithJava7IO(String url, String localFilename) {

        try (InputStream in = new URL(url).openStream()) {
            Files.copy(in, Paths.get(localFilename), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void downloadWithJavaNIO(String fileURL, String localFilename) throws IOException {

        URL url = new URL(fileURL);
        try (ReadableByteChannel readableByteChannel = Channels.newChannel(url.openStream()); 
            FileOutputStream fileOutputStream = new FileOutputStream(localFilename); FileChannel fileChannel = fileOutputStream.getChannel()) {

            fileChannel.transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
            fileOutputStream.close();
        }
    }

	
    public static void downloadWithApacheCommons(String url, String localFilename) {

        int CONNECT_TIMEOUT = 10000;
        int READ_TIMEOUT = 10000;
        try {
            FileUtils.copyURLToFile(new URL(url), new File(localFilename), CONNECT_TIMEOUT, READ_TIMEOUT);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

	/** 
    public static void downloadWithAHC(String url, String localFilename) throws ExecutionException, InterruptedException, IOException {

        FileOutputStream stream = new FileOutputStream(localFilename);
        AsyncHttpClient client = Dsl.asyncHttpClient();

        client.prepareGet(url)
            .execute(new AsyncCompletionHandler<FileOutputStream>() {

                @Override
                public State onBodyPartReceived(HttpResponseBodyPart bodyPart) throws Exception {
                    stream.getChannel()
                        .write(bodyPart.getBodyByteBuffer());
                    return State.CONTINUE;
                }

                @Override
                public FileOutputStream onCompleted(Response response) throws Exception {
                    return stream;
                }
            })
            .get();

        stream.getChannel().close();
        client.close();
    }
	*/


	public static long downloadFile(String downloadUrl, String saveAsFileName) throws IOException, URISyntaxException {

		File outputFile = new File(saveAsFileName);
		URLConnection downloadFileConnection = new URI(downloadUrl).toURL()
			.openConnection();
		return transferDataAndGetBytesDownloaded(downloadFileConnection, outputFile);
	}

	private static long transferDataAndGetBytesDownloaded(URLConnection downloadFileConnection, File outputFile) throws IOException {

		long bytesDownloaded = 0;
		try (InputStream is = downloadFileConnection.getInputStream(); OutputStream os = new FileOutputStream(outputFile, true)) {

			byte[] buffer = new byte[1024];

			int bytesCount;
			while ((bytesCount = is.read(buffer)) > 0) {
				os.write(buffer, 0, bytesCount);
				bytesDownloaded += bytesCount;
			}
		}
		return bytesDownloaded;
	}

	public static long downloadFileWithResume(String downloadUrl, String saveAsFileName) throws IOException, URISyntaxException {
		File outputFile = new File(saveAsFileName);

		URLConnection downloadFileConnection = addFileResumeFunctionality(downloadUrl, outputFile);
		return transferDataAndGetBytesDownloaded(downloadFileConnection, outputFile);
	}

	private static URLConnection addFileResumeFunctionality(String downloadUrl, File outputFile) throws IOException, URISyntaxException, ProtocolException, ProtocolException {
		long existingFileSize = 0L;
		URLConnection downloadFileConnection = new URI(downloadUrl).toURL()
			.openConnection();

		if (outputFile.exists() && downloadFileConnection instanceof HttpURLConnection) {
			HttpURLConnection httpFileConnection = (HttpURLConnection) downloadFileConnection;

			HttpURLConnection tmpFileConn = (HttpURLConnection) new URI(downloadUrl).toURL()
				.openConnection();
			tmpFileConn.setRequestMethod("HEAD");
			long fileLength = tmpFileConn.getContentLengthLong();
			existingFileSize = outputFile.length();

			if (existingFileSize < fileLength) {
				httpFileConnection.setRequestProperty("Range", "bytes=" + existingFileSize + "-" + fileLength);
			} else {
				throw new IOException("File Download already completed.");
			}
		}
		return downloadFileConnection;
	}
	
}





