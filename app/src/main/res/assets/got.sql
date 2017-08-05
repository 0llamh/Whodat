BEGIN TRANSACTION;
CREATE TABLE `android_metadata` (
	`locale`	TEXT DEFAULT 'en_us'
);
INSERT INTO `android_metadata` VALUES ('en_us');
CREATE TABLE "Characters" (
	`_id`	INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE,
	`Name`	TEXT NOT NULL,
	`Affiliation`	TEXT NOT NULL,
	`Relevance`	TEXT NOT NULL,
	`Background`	TEXT NOT NULL
);
INSERT INTO `Characters` VALUES (1,'Eddard "Ned" Stark','House Stark
','17','Lord Eddard is the head of House Stark, Warden of the North, and ruler of Winterfell. His house is one of the Great Houses of the realm ruling over the largest of the Seven Kingdoms. 

He was the second son of Lord Rickard Stark. Ned inherited his father''s title after the "Mad King" Aerys Targaryen murdered his father and older brother Brandon.

Ned is stoic, dutiful, and an honorable man and is considered to embody the greatest values of the North. He is a trusted and long time close friend with the current King of the Seven Kingdoms, Robert Baratheon. They fought alongside each other many years ago to overthrow the Targaryen''s in what is known as "Robert''s Rebellion."

After the war, Ned also inherited his older brother''s betrothed, Catelyn Stark and together formed a strong, loving marriage having 5 children: Robb, Sansa, Arya, Bran, and Rickon. Ned also had a illegitimate bastard son, Jon Snow, who was fathered during the war and now lives with the Starks in Winterfell much to the protest by Catelyn.

Ned has one younger brother, Benjen Stark, who now resides at the Night''s Watch and one sister, Lyanna Stark, who passed away years ago.');
INSERT INTO `Characters` VALUES (2,'Catelyn Stark','House Stark','1234','Catelyn is the first child of Lord Hoster of House Tully, the current ruling house of Riverrun, capital of the Riverlands region on the continent. She has a younger brother, Edmure, and a younger sister, Lysa. Catelyn also grew up with Petyr "Littlefinger" Baelish who was fostered by her father.

Catelyn was originally going to marry Brandon Stark, but after he died, she was promised to Brandon''s younger brother Eddard. Although they barely knew each other, they formed a strong and loving marriage with five children: Robb, Sansa, Arya, Bran, and Rickon. She has always been unhappy with Ned''s bastard Jon Snow, and it is the only point of friction in their marriage. She now lives alongside her husband in Winterfell.');
COMMIT;
