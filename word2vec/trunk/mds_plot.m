tags = textread('chr4Tags.txt', '%s', 'delimiter', '\n');
embeddings = csvread('chr4Vals.txt');
D = pdist(embeddings, 'euclidean')
[Y,e] = cmdscale(D);

% First 3 eigen values are >> other eigen values.
reducedY = Y(:,1:3);
scatter3(Y(:,1), Y(:,2), Y(:,3), 'filled');

% reducedY = Y(:,1:2);
% scatter(Y(:,1), Y(:,2), 'filled');
% text(Y(:,1), Y(:,2), tags, 'horizontal','left', 'vertical','bottom')