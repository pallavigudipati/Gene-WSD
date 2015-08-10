make
#if [ ! -e text8 ]; then
#  wget http://mattmahoney.net/dc/text8.zip -O text8.gz
#  gzip -d text8.gz -f
#fi
time ./word2vec -train ../../Code/src/data/w2vsequence3.txt -output classes.txt -cbow 1 -size 200 -window 8 -negative 25 -hs 0 -sample 1e-4 -threads 20 -iter 15 -min-count 0 -classes 6
sort classes.txt -k 2 -n > classes.sorted3.txt
echo The word classes were saved to file classes.sorted.txt
