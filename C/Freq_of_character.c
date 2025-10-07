#include <stdio.h>
#include <string.h>

int main() {
    char a[] = "aabbccdefg";
    int freq[256] = {0}; // ASCII characters

    for (int i = 0; i < strlen(a); i++) {
        freq[(unsigned char)a[i]]++;
    }

    for (int i = 0; i < 256; i++) {
        if (freq[i] > 0)
            printf("%c : %d\n", i, freq[i]);
    }

    return 0;
}
