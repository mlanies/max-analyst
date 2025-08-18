package defpackage;

import com.google.android.exoplayer2.ParserException;

/* loaded from: classes.dex */
public final class a28 {
    public int A;
    public int B;
    public int C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public byte[] N;
    public int O;
    public int P;
    public int Q;
    public long R;
    public long S;
    public b3f T;
    public boolean U;
    public boolean V;
    public String W;
    public xze X;
    public int Y;
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public byte[] i;
    public vze j;
    public byte[] k;
    public cr4 l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public float s;
    public float t;
    public float u;
    public byte[] v;
    public int w;
    public boolean x;
    public int y;
    public int z;

    public final byte[] a(String str) throws ParserException {
        byte[] bArr = this.k;
        if (bArr != null) {
            return bArr;
        }
        String strValueOf = String.valueOf(str);
        throw ParserException.a(null, strValueOf.length() != 0 ? "Missing CodecPrivate for codec ".concat(strValueOf) : new String("Missing CodecPrivate for codec "));
    }
}
