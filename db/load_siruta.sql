TRUNCATE localitati.siruta;
LOAD DATA LOCAL INFILE 'siruta_3.csv' INTO TABLE localitati.siruta FIELDS TERMINATED BY ','  ENCLOSED BY '"' LINES TERMINATED BY '\n' IGNORE 1 ROWS
( 
   @col1
 , @col2
 , @col3
 , @col4
 , @col5
 , @col6
 , @col7
 , @col8
 , @col9
 , @col10
 , @col11
 , @col12
 , @col13
 , @col14
 , @col15
 , @col16
 , @col17
 , @col18
 , @col19
 , @col20
 , @col21
 , @col22
 , @col23
 , @col24
 , @col25
 , @col26
 , @col27
 , @col28
 , @col29
 , @col30
 , @col31
 , @col32
 , @col33
 , @col34
 , @col35
 , @col36
 , @col37
 , @col38
 , @col39
 , @col40
 , @col41
 , @col42
 , @col43
 , @col44
 , @col45
 , @col46
 , @col47
 ) 
 SET 
     SIRUTA = @col1
  ,  DENLOC = @col2	
  ,  CODP   = @col3	
  ,  JUD    = @col4	
  ,  SIRSUP = @col5	
  ,  TIP    = @col6	
  ,  NIV    = @col7	
  ,  MED    = @col8	
  ,  REGIUNE= @col9	
  ,  FSJ    = @col10	
  ,  FS2    = @col11	
  ,  FS3    = @col12	
 ,   FSL    = @col13	
 ,   Rang   = @col14	
 ,   fictiv = @col15
;