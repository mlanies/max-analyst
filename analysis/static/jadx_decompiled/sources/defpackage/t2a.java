package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class t2a {
    public int A;
    public long B;
    public wd6 C;
    public a8g a = new a8g(7);
    public bkg b = new bkg(9);
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public qqd e = new qqd(29, (byte) 0);
    public boolean f = true;
    public ob6 g;
    public boolean h;
    public boolean i;
    public kj6 j;
    public qq9 k;
    public Proxy l;
    public ProxySelector m;
    public ob6 n;
    public SocketFactory o;
    public SSLSocketFactory p;
    public X509TrustManager q;
    public List r;
    public List s;
    public HostnameVerifier t;
    public e12 u;
    public a14 v;
    public int w;
    public int x;
    public int y;
    public int z;

    public t2a() {
        ob6 ob6Var = ob6.a;
        this.g = ob6Var;
        this.h = true;
        this.i = true;
        this.j = kj6.c;
        this.k = qq9.s0;
        this.n = ob6Var;
        this.o = SocketFactory.getDefault();
        this.r = u2a.P0;
        this.s = u2a.O0;
        this.t = s2a.a;
        this.u = e12.c;
        this.x = 10000;
        this.y = 10000;
        this.z = 10000;
        this.B = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }
}
