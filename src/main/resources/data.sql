INSERT INTO tags(name) VALUES('JS');
INSERT INTO tags(name) VALUES('Vue');
INSERT INTO tags(name) VALUES('Python');
INSERT INTO tags(name) VALUES('Java');

INSERT INTO tools(description, title, url) VALUES('Editor de texto para desenvolvedores', 'VsCode', 'https://code.visualstudio.com/');
INSERT INTO tools(description, title, url) VALUES('Editor de texto para desenvolvedores Java', 'Eclipse', 'https://eclipse.org/');
INSERT INTO tools(description, title, url) VALUES('Editor de texto para desenvolvedores Python', 'PyCharm', 'https://www.jetbrains.com/pt-br/pycharm/');

INSERT INTO tools_tags(tools_id, tags_id) VALUES(1, 1);
INSERT INTO tools_tags(tools_id, tags_id) VALUES(1, 2);
INSERT INTO tools_tags(tools_id, tags_id) VALUES(1, 3);
INSERT INTO tools_tags(tools_id, tags_id) VALUES(1, 4);
INSERT INTO tools_tags(tools_id, tags_id) VALUES(2, 4);
INSERT INTO tools_tags(tools_id, tags_id) VALUES(3, 3);


