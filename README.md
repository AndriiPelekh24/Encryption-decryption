# Encryption/Decryption Tool

Command-line tool for encrypting and decrypting text using Shift or Unicode algorithms.

## Compilation
```bash
javac -d out src/encryptdecrypt/**/*.java src/encryptdecrypt/*.java
```

## Usage
```bash
java -cp out encryptdecrypt.Main [options]
```

### Options

- `-mode` - `enc` or `dec` (default: `enc`)
- `-key` - encryption key (default: `0`)
- `-data` - text to encrypt/decrypt
- `-in` - input file path
- `-out` - output file path
- `-alg` - `shift` or `unicode` (default: `shift`)

## Examples

**Encrypt text:**
```bash
java -cp out encryptdecrypt.Main -mode enc -key 5 -data "Hello World" -alg shift
```

**Decrypt text:**
```bash
java -cp out encryptdecrypt.Main -mode dec -key 5 -data "Mjqqt Btwqi" -alg shift
```

**Encrypt file:**
```bash
java -cp out encryptdecrypt.Main -mode enc -key 5 -in input.txt -out output.txt -alg shift
```

**Decrypt file:**
```bash
java -cp out encryptdecrypt.Main -mode dec -key 5 -in output.txt -out decrypted.txt -alg shift
```

## Algorithms

- **shift** - Caesar cipher (letters only)
- **unicode** - All characters
