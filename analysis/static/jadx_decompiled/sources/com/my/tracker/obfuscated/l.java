package com.my.tracker.obfuscated;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class l extends r0 {
    private final a c;

    public static class a extends ByteArrayOutputStream {
        private final int a;
        private int b;
        private int c;

        public a(int i) {
            super(i);
            this.a = i;
            this.b = Integer.MAX_VALUE;
            this.c = -1;
        }

        public synchronized void m() {
            try {
                reset();
                if (y0.a()) {
                    StringBuilder sb = new StringBuilder("SimpleByteArrayOutputStream: minSize=");
                    int i = this.b;
                    if (i == Integer.MAX_VALUE) {
                        i = 0;
                    }
                    sb.append(i);
                    sb.append(", maxSize=");
                    sb.append(this.c);
                    sb.append(", truncate=");
                    sb.append(this.a);
                    y0.a(sb.toString());
                }
                this.b = Integer.MAX_VALUE;
                this.c = -1;
                int length = ((ByteArrayOutputStream) this).buf.length;
                int i2 = this.a;
                if (length > i2) {
                    ((ByteArrayOutputStream) this).buf = new byte[i2];
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.ByteArrayOutputStream
        public synchronized void reset() {
            try {
                int i = ((ByteArrayOutputStream) this).count;
                if (i > 0) {
                    this.b = Integer.min(this.b, i);
                }
                this.c = Integer.max(((ByteArrayOutputStream) this).count, this.c);
                super.reset();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public l(int i) {
        super(new a(i));
        this.c = (a) this.a;
    }

    public void a() {
        this.c.reset();
    }

    public int b() {
        return this.c.size();
    }

    public byte[] c() {
        return this.c.toByteArray();
    }

    public void d() {
        this.c.m();
    }

    public void a(OutputStream outputStream) {
        this.c.writeTo(outputStream);
    }
}
