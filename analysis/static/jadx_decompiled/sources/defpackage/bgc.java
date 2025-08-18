package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class bgc extends ol implements lme, hua {
    public final long o;

    public bgc(long j, long j2) {
        super(j);
        this.o = j2;
    }

    @Override // defpackage.hua
    public final int c() {
        return 1;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.io.Serializable, long[]] */
    @Override // defpackage.hua
    public final void d() {
        long jT = ((p7b) r()).a.t();
        if (jT > 0) {
            k4a k4aVar = (k4a) j();
            k4a.v(k4aVar, new oc2(((p7b) k4aVar.y()).a.o(), new long[]{jT}, 1));
        }
        t().d(this.a);
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        cgc cgcVar = (cgc) gleVar;
        ((p7b) r()).a.m("user.deviceAvatarPath", null);
        pl plVar = this.c;
        ((blb) (plVar != null ? plVar : null).W.getValue()).b(cgcVar.c);
        l().c(new dgc(this.a, cgcVar.c.a));
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.RemoveContactPhoto removeContactPhoto = new Tasks.RemoveContactPhoto();
        removeContactPhoto.requestId = this.a;
        removeContactPhoto.photoId = this.o;
        return qw8.toByteArray(removeContactPhoto);
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        if (!f46.U(pkeVar.b)) {
            d();
        }
        l().c(new oi0(this.a, pkeVar));
    }

    @Override // defpackage.hua
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.I0;
    }

    @Override // defpackage.ol
    public final dle i() {
        return new gs9(this.o);
    }
}
