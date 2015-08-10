make
# if [ ! -e text8 ]; then
#  wget http://mattmahoney.net/dc/text8.zip -O text8.gz
#  gzip -d text8.gz -f
# fi
time ./word2vec -train ../../Code/src/data/w2vsequence4.txt -output vectors4 -cbow 1 -size 200 -window 2 -negative 25 -hs 0 -sample 1e-4 -threads 20 -binary 1 -iter 15 -min-count 5
./distance vectors4
