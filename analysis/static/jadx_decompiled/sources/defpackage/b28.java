package defpackage;

import androidx.media3.common.ParserException;

/* loaded from: classes.dex */
public final class b28 {
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public byte[] O;
    public int P;
    public int Q;
    public int R;
    public long S;
    public long T;
    public b3f U;
    public boolean V;
    public boolean W;
    public String X;
    public yze Y;
    public int Z;
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public byte[] i;
    public wze j;
    public byte[] k;
    public dr4 l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public float t;
    public float u;
    public float v;
    public byte[] w;
    public int x;
    public boolean y;
    public int z;

    public final byte[] a(String str) throws ParserException {
        byte[] bArr = this.k;
        if (bArr != null) {
            return bArr;
        }
        throw ParserException.a(null, "Missing CodecPrivate for codec " + str);
    }
}
