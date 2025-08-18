package defpackage;

import android.content.Context;
import android.media.MediaCodec;

/* loaded from: classes.dex */
public final class rz3 {
    public Object a;
    public Object b;
    public int c;
    public Object d;
    public Object e;
    public int f;
    public int g;
    public int h;
    public final Object i;
    public Object j;

    public rz3(qld qldVar, Context context, ag1 ag1Var, a4c a4cVar) {
        this.a = qldVar;
        this.b = context;
        this.d = ag1Var;
        this.e = a4cVar;
        this.i = new a8d();
    }

    public rz3(int i) {
        switch (i) {
            case 1:
                MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
                this.i = cryptoInfo;
                this.j = oaf.a >= 24 ? new h7b(cryptoInfo) : null;
                break;
            default:
                MediaCodec.CryptoInfo cryptoInfo2 = new MediaCodec.CryptoInfo();
                this.i = cryptoInfo2;
                this.j = maf.a >= 24 ? new va8(cryptoInfo2) : null;
                break;
        }
    }
}
