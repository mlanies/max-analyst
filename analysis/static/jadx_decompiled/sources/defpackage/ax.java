package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class ax implements s7c, a95 {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public volatile Object o;

    public /* synthetic */ ax(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.q7c
    public Object T0(Object obj, bc7 bc7Var) {
        switch (this.a) {
            case 0:
                Object obj2 = this.o;
                if (obj2 != null) {
                    return obj2;
                }
                Object value = ((je7) this.b).getValue();
                this.o = value;
                return value;
            default:
                Object obj3 = this.o;
                if (obj3 != null) {
                    return obj3;
                }
                Object value2 = ((je7) this.b).getValue();
                this.o = value2;
                return value2;
        }
    }

    @Override // defpackage.a95
    public void b() {
        ((nl) this.b).setSessionInfo(null);
        jxc jxcVar = jxc.c;
        ((p31) this.c).getClass();
        d(jxcVar.b("CGPGAGLGDIHBABABA"));
    }

    @Override // defpackage.a95
    public jxc c() {
        String str;
        jxc jxcVarC = (jxc) this.o;
        if (jxcVarC == null) {
            ml sessionInfo = ((nl) this.b).getSessionInfo();
            jxc jxcVar = jxc.c;
            ((p31) this.c).getClass();
            jxc jxcVarB = jxcVar.b("CGPGAGLGDIHBABABA");
            if ((sessionInfo != null ? sessionInfo.c : null) != null) {
                jxcVarB = jxcVarB.d(Uri.parse(sessionInfo.c));
            }
            jxcVarC = ((sessionInfo != null ? sessionInfo.a : null) == null || (str = sessionInfo.b) == null) ? jxcVarB : jxcVarB.c(sessionInfo.a, str);
        }
        this.o = jxcVarC;
        return jxcVarC;
    }

    @Override // defpackage.a95
    public void d(jxc jxcVar) {
        this.o = jxcVar;
        Uri uriA = jxcVar.a();
        wk wkVar = jxcVar.a;
        ((nl) this.b).setSessionInfo(new ml(wkVar.d, wkVar.e, uriA != null ? uriA.toString() : null));
    }

    @Override // defpackage.s7c
    public void o1(Object obj, bc7 bc7Var, Object obj2) {
        switch (this.a) {
            case 0:
                Object obj3 = this.o;
                this.o = obj2;
                ((bx) this.c).k.c((sk6) obj2);
                break;
            default:
                Object obj4 = this.o;
                this.o = obj2;
                ((nl6) this.c).c.getClass();
                break;
        }
    }

    public ax() {
        this.a = 1;
        this.b = new bkb(4);
    }

    public ax(vte vteVar) {
        this.a = 3;
        this.b = vteVar;
        this.o = new r36(0, 0L);
    }
}
