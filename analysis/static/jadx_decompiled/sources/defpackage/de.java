package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class de implements oud {
    public static final wd6 f = new wd6(2);
    public final Method a;
    public final Method b;
    public final Method c;
    public final Method d;
    public final Class e;

    public de(Class cls) {
        this.e = cls;
        this.a = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        this.b = cls.getMethod("setHostname", String.class);
        this.c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.oud
    public final boolean a() {
        boolean z = xd.e;
        return xd.e;
    }

    @Override // defpackage.oud
    public final boolean b(SSLSocket sSLSocket) {
        return this.e.isInstance(sSLSocket);
    }

    @Override // defpackage.oud
    public final String c(SSLSocket sSLSocket) {
        if (!this.e.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.c.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (NullPointerException e2) {
            if (tpa.f(e2.getMessage(), "ssl == null")) {
                return null;
            }
            throw e2;
        } catch (InvocationTargetException e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // defpackage.oud
    public final void d(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.e.isInstance(sSLSocket)) {
            try {
                this.a.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.b.invoke(sSLSocket, str);
                }
                Method method = this.d;
                q2b q2bVar = q2b.a;
                method.invoke(sSLSocket, b46.i(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
