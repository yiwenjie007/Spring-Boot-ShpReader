CREATE TABLE `geotable` (
  `gid` int(11) NOT NULL AUTO_INCREMENT,
  `osm_id` varchar(128) NOT NULL,
  `fclass` varchar(128) NOT NULL,
  `code` int(11) NOT NULL,
  `name` varchar(128) NOT NULL,
  `type` varchar(128) NOT NULL,
  `geom` blob NOT NULL,
  PRIMARY KEY (`gid`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8
