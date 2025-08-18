package defpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class lk5 extends tfg {
    public static boolean F(File file) {
        jj5 jj5Var = new jj5(new lj5(file));
        while (true) {
            boolean z = true;
            while (jj5Var.hasNext()) {
                File file2 = (File) jj5Var.next();
                if (!file2.delete() && file2.exists()) {
                    z = false;
                } else {
                    if (z) {
                        break;
                    }
                    z = false;
                }
            }
            return z;
        }
    }

    public static byte[] G(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrCopyOf = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStream.read(bArrCopyOf, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
            } else {
                int i5 = fileInputStream.read();
                if (i5 != -1) {
                    w85 w85Var = new w85(8193);
                    w85Var.write(i5);
                    ema.l(fileInputStream, w85Var, 8192);
                    int size = w85Var.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrM = w85Var.m();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    System.arraycopy(bArrM, 0, bArrCopyOf, i, w85Var.size());
                }
            }
            v3c.i(fileInputStream, null);
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                v3c.i(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static ArrayList H(File file) {
        Charset charset = a52.a;
        ArrayList arrayList = new ArrayList();
        c0 c0Var = new c0(1, arrayList);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
        try {
            Iterator it = new ni3(new at(3, bufferedReader)).iterator();
            while (it.hasNext()) {
                c0Var.invoke(it.next());
            }
            v3c.i(bufferedReader, null);
            return arrayList;
        } finally {
        }
    }

    public static String I(File file) {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), a52.a);
        try {
            String strH = m6d.H(inputStreamReader);
            v3c.i(inputStreamReader, null);
            return strH;
        } finally {
        }
    }

    public static File J(File file, String str) {
        int length;
        File file2;
        int iZ0;
        File file3 = new File(str);
        String path = file3.getPath();
        char c = File.separatorChar;
        int iZ02 = w9e.z0(path, c, 0, false, 4);
        if (iZ02 != 0) {
            length = (iZ02 <= 0 || path.charAt(iZ02 + (-1)) != ':') ? (iZ02 == -1 && w9e.s0(path, ':')) ? path.length() : 0 : iZ02 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c || (iZ0 = w9e.z0(path, c, 2, false, 4)) < 0) {
            length = 1;
        } else {
            int iZ03 = w9e.z0(path, c, iZ0 + 1, false, 4);
            length = iZ03 >= 0 ? iZ03 + 1 : path.length();
        }
        if (length > 0) {
            return file3;
        }
        String string = file.toString();
        if ((string.length() == 0) || w9e.s0(string, c)) {
            file2 = new File(string + file3);
        } else {
            file2 = new File(string + c + file3);
        }
        return file2;
    }

    public static void K(File file, String str) {
        Charset charset = a52.a;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            L(fileOutputStream, str, charset);
            v3c.i(fileOutputStream, null);
        } finally {
        }
    }

    public static final void L(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        if (str.length() < 16384) {
            fileOutputStream.write(str.getBytes(charset));
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            str.getChars(i, i3, charBufferAllocate.array(), i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i3 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.".toString());
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i = i3;
        }
    }
}
