package defpackage;

import org.webrtc.RTCStats;

/* loaded from: classes2.dex */
public final /* synthetic */ class m82 implements qj3, jm7, q7c, b7b, b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ m82() {
        this.a = 5;
        this.b = "payloadType";
    }

    @Override // defpackage.q7c
    public Object T0(Object obj, bc7 bc7Var) {
        RTCStats rTCStats = (RTCStats) obj;
        switch (this.a) {
            case 5:
                Object obj2 = rTCStats.getMembers().get(this.b);
                if (obj2 != null) {
                    return e4c.c(obj2);
                }
                return null;
            default:
                Object obj3 = rTCStats.getMembers().get(this.b);
                if (obj3 != null) {
                    return obj3.toString();
                }
                return null;
        }
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        i10 i10Var;
        String str = this.b;
        switch (this.a) {
            case 0:
                ((u82) obj).h = str;
                return;
            case 1:
            default:
                j10 j10Var = (j10) obj;
                i10 i10Var2 = j10Var.e;
                if (i10Var2 == null) {
                    i10Var2 = i10.j;
                }
                if (i10Var2 != null) {
                    h10 h10VarA = i10Var2.a();
                    h10VarA.b = str;
                    i10Var = new i10(h10VarA);
                } else {
                    i10Var = null;
                }
                j10Var.e = i10Var;
                return;
            case 2:
                m20 m20Var = (m20) obj;
                for (int i = 0; i < m20Var.b(); i++) {
                    if (s5c.y(str, m20Var.d(i).r)) {
                        if (i < 0 || i >= m20Var.b()) {
                            throw new IllegalArgumentException("index < 0 or index >= attaches.size()");
                        }
                        m20Var.a.remove(i);
                    }
                }
                return;
            case 3:
                hm9.o("au8", "Can't update attach async localId = " + str);
                return;
        }
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        w8f w8fVar = (w8f) obj;
        w8fVar.getClass();
        return new sa3(2, new uh(w8fVar, 29, this.b));
    }

    @Override // defpackage.jm7, defpackage.km7
    public void invoke(Object obj) {
        ((u65) obj).getClass();
        hm9.n("u65", "videoDebugListener.onVideoDecoderInitialized decoder = " + this.b);
    }

    @Override // defpackage.b7b
    public boolean test(Object obj) {
        switch (this.a) {
            case 7:
                return ((iq0) obj).c.contains(this.b);
            case 8:
                return ((iq0) obj).c.equals(this.b);
            default:
                String str = ((p8f) obj).a;
                return str != null && str.equals(this.b);
        }
    }

    public /* synthetic */ m82(ed edVar, String str, long j, long j2) {
        this.a = 1;
        this.b = str;
    }

    public /* synthetic */ m82(String str, int i) {
        this.a = i;
        this.b = str;
    }
}
