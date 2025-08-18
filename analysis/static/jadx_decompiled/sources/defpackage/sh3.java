package defpackage;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class sh3 {
    public int a;
    public boolean b;
    public boolean c;
    public final List d;

    public sh3(List list) {
        this.d = list;
    }

    public final rh3 a(SSLSocket sSLSocket) throws UnknownServiceException, CloneNotSupportedException {
        rh3 rh3Var;
        int i;
        boolean z;
        int i2 = this.a;
        List list = this.d;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                rh3Var = null;
                break;
            }
            rh3Var = (rh3) list.get(i2);
            if (rh3Var.b(sSLSocket)) {
                this.a = i2 + 1;
                break;
            }
            i2++;
        }
        if (rh3Var == null) {
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.c + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        int i3 = this.a;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z = false;
                break;
            }
            if (((rh3) list.get(i3)).b(sSLSocket)) {
                z = true;
                break;
            }
            i3++;
        }
        this.b = z;
        boolean z2 = this.c;
        String[] strArr = rh3Var.c;
        String[] strArrO = strArr != null ? naf.o(sSLSocket.getEnabledCipherSuites(), strArr, u13.b) : sSLSocket.getEnabledCipherSuites();
        String[] strArr2 = rh3Var.d;
        String[] strArrO2 = strArr2 != null ? naf.o(sSLSocket.getEnabledProtocols(), strArr2, rm9.b) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        fs4 fs4Var = u13.b;
        byte[] bArr = naf.a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (fs4Var.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z2 && i != -1) {
            String str = supportedCipherSuites[i];
            strArrO = (String[]) Arrays.copyOf(strArrO, strArrO.length + 1);
            strArrO[strArrO.length - 1] = str;
        }
        qh3 qh3Var = new qh3(rh3Var);
        qh3Var.c((String[]) Arrays.copyOf(strArrO, strArrO.length));
        qh3Var.f((String[]) Arrays.copyOf(strArrO2, strArrO2.length));
        rh3 rh3VarA = qh3Var.a();
        if (rh3VarA.c() != null) {
            sSLSocket.setEnabledProtocols(rh3VarA.d);
        }
        if (rh3VarA.a() != null) {
            sSLSocket.setEnabledCipherSuites(rh3VarA.c);
        }
        return rh3Var;
    }
}
