package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class fi6 {
    public final khe a;
    public final awe b;
    public final u13 c;
    public final List d;

    public fi6(awe aweVar, u13 u13Var, List list, k56 k56Var) {
        this.b = aweVar;
        this.c = u13Var;
        this.d = list;
        this.a = new khe(new ei6(0, k56Var));
    }

    public final List a() {
        return (List) this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fi6) {
            fi6 fi6Var = (fi6) obj;
            if (fi6Var.b == this.b && tpa.f(fi6Var.c, this.c) && tpa.f(fi6Var.a(), a()) && tpa.f(fi6Var.d, this.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((a().hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(z53.S(listA, 10));
        for (Certificate certificate : listA) {
            arrayList.add(certificate instanceof X509Certificate ? ((X509Certificate) certificate).getSubjectDN().toString() : certificate.getType());
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.b);
        sb.append(" cipherSuite=");
        sb.append(this.c);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.d;
        ArrayList arrayList2 = new ArrayList(z53.S(list, 10));
        for (Certificate certificate2 : list) {
            arrayList2.add(certificate2 instanceof X509Certificate ? ((X509Certificate) certificate2).getSubjectDN().toString() : certificate2.getType());
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
