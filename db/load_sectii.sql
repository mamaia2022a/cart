TRUNCATE localitati.sectii;
LOAD DATA LOCAL INFILE 'sectii.csv' INTO TABLE localitati.sectii FIELDS TERMINATED BY '@'  ENCLOSED BY '"' LINES TERMINATED BY '$' IGNORE 1 ROWS
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
 ) 
 SET 
     judet       = @col2
  ,  uat         = @col3	
  ,  cod_siruta  = @col4	
  ,  nr_birou    = @col5	
  ,  nr_sv       = @col6	
  ,  sediu_sv    = @col7	
  ,  adresa_sv   = @col8	
  ,  localitate_sat  = @col10	
  ,  cod_artera      = @col11	
  ,  artera          = @col12
  ,  numar_imobil    = @col13	
 ,   observatii      = @col14	
;