package defpackage;

import java.util.List;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public abstract class gp4 {
    public static uaa a(byte[] bArr, o45 o45Var) {
        Protos.MessageElement[] messageElementArr;
        if (bArr.length == 0) {
            return null;
        }
        try {
            dpb dpbVar = (dpb) qw8.mergeFrom(new dpb(), bArr);
            String str = dpbVar.b;
            Protos.MessageElements messageElements = dpbVar.i;
            xd7 xd7Var = new xd7(str, (messageElements == null || (messageElementArr = messageElements.elements) == null || messageElementArr.length == 0) ? null : ou8.a(messageElementArr));
            long j = dpbVar.k;
            long j2 = dpbVar.d;
            Long lValueOf = j2 == 0 ? null : Long.valueOf(j2);
            long j3 = dpbVar.c;
            Long lValueOf2 = j3 == 0 ? null : Long.valueOf(j3);
            long j4 = dpbVar.h;
            return new uaa(j, xd7Var, lValueOf, lValueOf2, j4 == 0 ? null : Long.valueOf(j4), dpbVar.j, 64);
        } catch (Exception e) {
            hm9.p(gp4.class.getName(), "Can't parse draft", e);
            if (o45Var != null) {
                ((cba) o45Var).c(new HandledException("Can't parse draft"), true);
            }
            return null;
        }
    }

    public static byte[] b(uaa uaaVar) {
        boolean z = uaaVar instanceof uaa;
        byte[] bArr = nd7.g;
        if (!z || uaaVar.d()) {
            return bArr;
        }
        dpb dpbVar = new dpb();
        dpbVar.k = uaaVar.a;
        xd7 xd7Var = uaaVar.b;
        if (!fm9.G(xd7Var)) {
            dpbVar.b = xd7Var.a;
            List list = xd7Var.b;
            if (list != null && !list.isEmpty()) {
                dpbVar.i = ou8.c(list);
            }
        }
        Long l = uaaVar.d;
        dpbVar.c = l != null ? l.longValue() : 0L;
        Long l2 = uaaVar.c;
        dpbVar.d = l2 != null ? l2.longValue() : 0L;
        Long l3 = uaaVar.e;
        dpbVar.h = l3 != null ? l3.longValue() : 0L;
        dpbVar.j = uaaVar.f;
        return qw8.toByteArray(dpbVar);
    }
}
