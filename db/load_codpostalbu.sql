TRUNCATE localitati.codpostalbuc;
LOAD DATA LOCAL INFILE 'codpostalbu.csv' INTO TABLE localitati.codpostalbuc FIELDS TERMINATED BY '@'  ENCLOSED BY '"' LINES TERMINATED BY '$' IGNORE 1 ROWS
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
     tip_artera      = @col2
  ,  denumire_artera = @col3	
  ,  numar           = @col4	
  ,  sector          = @col5	
  ,  codpostal       = @col6	
  ,  oficiu          = @col7	
  ,  siruta          = @col8	
  ,  niv             = @col9	
  ,  sirsup          = @col10	
  ,  tip_arteragood  = @col11
  ,  arteragood      = @col12
  ,  cuvant1         = @col13	
  ,  cuvant2         = @col14	
  ,  cuvant3         = @col15	
;