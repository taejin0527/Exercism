from string import ascii_lowercase


def is_pangram(sentence='abcd1234_dfka'):
    # pangram == a sentence using every letter of the alphabet at least once

    ALPHABET = set(ascii_lowercase)
    return ALPHABET.issubset(sentence.lower())
