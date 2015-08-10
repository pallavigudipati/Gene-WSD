/*
 * Author: Pallavi Gudipati
 * Project: DDP
 */

#include "api/BamReader.h"

#include <algorithm>
#include <iostream>
#include <string>
#include <vector>

using namespace std;
using namespace BamTools;

int main() {
	BamReader reader;
	if (!reader.Open("Example.bam")) {
		cout << "Error in opening file." << endl;
	}

	BamAlignment al;
	while (reader.GetNextAlignmentCore(al)) {
		al.BuildCharData();
		// There is another function called .AlignedBases. Not
		// exactly sure how to use the alignment info yet.
		cout << al.QueryBases << endl;	
	}
	return 1;
}	
