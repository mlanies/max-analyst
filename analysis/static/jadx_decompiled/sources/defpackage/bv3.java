package defpackage;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLContext;

/* loaded from: classes2.dex */
public final class bv3 implements k56 {
    public final /* synthetic */ int a;
    public static final bv3 b = new bv3(0);
    public static final bv3 c = new bv3(1);
    public static final bv3 o = new bv3(2);
    public static final bv3 X = new bv3(3);
    public static final bv3 Y = new bv3(4);
    public static final bv3 Z = new bv3(5);
    public static final bv3 s0 = new bv3(6);
    public static final bv3 t0 = new bv3(7);
    public static final bv3 u0 = new bv3(8);
    public static final bv3 v0 = new bv3(9);
    public static final bv3 w0 = new bv3(10);
    public static final bv3 x0 = new bv3(11);

    public /* synthetic */ bv3(int i) {
        this.a = i;
    }

    @Override // defpackage.k56
    public final Object invoke() throws NoSuchAlgorithmException, KeyManagementException {
        switch (this.a) {
            case 0:
                return uu3.class;
            case 1:
                return uu3.class;
            case 2:
                return uu3.class;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return jyc.a;
            case 7:
                return y8a.a;
            case 8:
                return y8a.a.o();
            case 9:
                return new d56(new ConcurrentHashMap(64));
            case 10:
                return new d56(new ConcurrentHashMap(64));
            default:
                SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
                sSLContext.init(null, null, null);
                return sSLContext;
        }
    }
}
