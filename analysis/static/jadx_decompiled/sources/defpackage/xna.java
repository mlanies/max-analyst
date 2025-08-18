package defpackage;

import android.text.GetChars;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.CharBuffer;

/* loaded from: classes2.dex */
public final class xna extends Writer {
    public static final char[] X = {'n', 'u', 'l', 'l'};
    public final char[] a;
    public final byte[] b;
    public final OutputStream c;
    public final kaf o;

    public xna(OutputStream outputStream) {
        kaf kafVar = new kaf();
        this.a = new char[Math.max(128, 1)];
        this.c = outputStream;
        this.o = kafVar;
        this.b = new byte[Math.max(128, 4)];
    }

    public final void a(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof String) {
            write((String) charSequence, i, i2);
            return;
        }
        if (charSequence instanceof StringBuilder) {
            StringBuilder sb = (StringBuilder) charSequence;
            char[] cArr = this.a;
            int length = cArr.length;
            synchronized (((Writer) this).lock) {
                while (i2 > 0) {
                    try {
                        int iMin = Math.min(length, i2);
                        int i3 = i + iMin;
                        sb.getChars(i, i3, cArr, 0);
                        write(cArr, 0, iMin);
                        i2 -= iMin;
                        i = i3;
                    } finally {
                    }
                }
            }
            return;
        }
        if (charSequence instanceof StringBuffer) {
            StringBuffer stringBuffer = (StringBuffer) charSequence;
            char[] cArr2 = this.a;
            int length2 = cArr2.length;
            synchronized (((Writer) this).lock) {
                while (i2 > 0) {
                    try {
                        int iMin2 = Math.min(length2, i2);
                        int i4 = i + iMin2;
                        stringBuffer.getChars(i, i4, cArr2, 0);
                        write(cArr2, 0, iMin2);
                        i2 -= iMin2;
                        i = i4;
                    } finally {
                    }
                }
            }
            return;
        }
        if (charSequence instanceof GetChars) {
            GetChars getChars = (GetChars) charSequence;
            char[] cArr3 = this.a;
            int length3 = cArr3.length;
            synchronized (((Writer) this).lock) {
                while (i2 > 0) {
                    try {
                        int iMin3 = Math.min(length3, i2);
                        int i5 = i + iMin3;
                        getChars.getChars(i, i5, cArr3, 0);
                        write(cArr3, 0, iMin3);
                        i2 -= iMin3;
                        i = i5;
                    } finally {
                    }
                }
            }
            return;
        }
        if (charSequence instanceof CharBuffer) {
            CharBuffer charBuffer = (CharBuffer) charSequence;
            if (charBuffer.hasArray()) {
                write(charBuffer.array(), charBuffer.arrayOffset() + i, i2);
                return;
            }
        }
        char[] cArr4 = this.a;
        int length4 = cArr4.length;
        synchronized (((Writer) this).lock) {
            while (i2 > 0) {
                try {
                    int iMin4 = Math.min(length4, i2);
                    int i6 = i + iMin4;
                    int i7 = 0;
                    while (i7 < iMin4) {
                        cArr4[i7] = charSequence.charAt(i);
                        i7++;
                        i++;
                    }
                    write(cArr4, 0, iMin4);
                    i2 -= iMin4;
                    i = i6;
                } finally {
                }
            }
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int iB;
        synchronized (((Writer) this).lock) {
            kaf kafVar = this.o;
            byte[] bArr = this.b;
            int length = bArr.length;
            if (kafVar.c != 0) {
                iB = kafVar.b(0, bArr);
                kafVar.c = (char) 0;
            } else {
                iB = 0;
            }
            this.c.write(this.b, 0, iB);
            this.c.close();
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        synchronized (((Writer) this).lock) {
            this.c.flush();
        }
    }

    @Override // java.io.Writer
    public final void write(int i) {
        char[] cArr = this.a;
        cArr[0] = (char) i;
        write(cArr, 0, 1);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c) {
        write(c);
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        synchronized (((Writer) this).lock) {
            int i3 = i + i2;
            int i4 = i;
            int i5 = i2;
            while (i4 < i3) {
                try {
                    kaf kafVar = this.o;
                    byte[] bArr = this.b;
                    long jA = kafVar.a(cArr, i4, i5, bArr, bArr.length);
                    this.c.write(this.b, 0, (int) jA);
                    i4 = (int) (jA >> 32);
                    i5 = i3 - i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c) {
        write(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        if (charSequence == null) {
            write(X, 0, 4);
        } else {
            a(charSequence, 0, charSequence.length());
        }
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            write(X, 0, 4);
        } else {
            a(charSequence, i, i2 - i);
        }
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        char[] cArr = this.a;
        int length = cArr.length;
        synchronized (((Writer) this).lock) {
            while (i2 > 0) {
                try {
                    int iMin = Math.min(length, i2);
                    int i3 = i + iMin;
                    str.getChars(i, i3, cArr, 0);
                    write(cArr, 0, iMin);
                    i2 -= iMin;
                    i = i3;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr) {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public final void write(String str) {
        write(str, 0, str.length());
    }
}
