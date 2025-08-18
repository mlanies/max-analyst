package defpackage;

import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
public final class ip7 extends w0e {
    public final /* synthetic */ int Y = 2;
    public final /* synthetic */ hab Z;
    public final /* synthetic */ eab s0;
    public final /* synthetic */ Object t0;
    public final /* synthetic */ dab u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip7(fi0 fi0Var, hab habVar, eab eabVar, sse sseVar) {
        super(fi0Var, habVar, eabVar, "BackgroundThreadHandoffProducer");
        this.t0 = fi0Var;
        this.Z = habVar;
        this.s0 = eabVar;
        this.u0 = sseVar;
    }

    private final void h(Object obj) {
    }

    @Override // defpackage.w0e
    public final void b(Object obj) {
        switch (this.Y) {
            case 0:
                g05.d((g05) obj);
                break;
            case 1:
                o43.S((o43) obj);
                break;
        }
    }

    @Override // defpackage.w0e
    public Map c(Object obj) {
        switch (this.Y) {
            case 1:
                return dx6.a("createdThumbnail", String.valueOf(((o43) obj) != null));
            default:
                return super.c(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.w0e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ip7.d():java.lang.Object");
    }

    @Override // defpackage.w0e
    public void f(Exception exc) {
        switch (this.Y) {
            case 1:
                super.f(exc);
                hab habVar = this.Z;
                eab eabVar = this.s0;
                habVar.e(eabVar, "VideoThumbnailProducer", false);
                ((oj0) eabVar).h("local", MediaStreamTrack.VIDEO_TRACK_KIND);
                break;
            default:
                super.f(exc);
                break;
        }
    }

    @Override // defpackage.w0e
    public void g(Object obj) {
        switch (this.Y) {
            case 1:
                o43 o43Var = (o43) obj;
                super.g(o43Var);
                boolean z = o43Var != null;
                hab habVar = this.Z;
                eab eabVar = this.s0;
                habVar.e(eabVar, "VideoThumbnailProducer", z);
                ((oj0) eabVar).h("local", MediaStreamTrack.VIDEO_TRACK_KIND);
                break;
            case 2:
                hab habVar2 = this.Z;
                eab eabVar2 = this.s0;
                habVar2.a(eabVar2, "BackgroundThreadHandoffProducer", null);
                ((sse) this.u0).b.a((fi0) this.t0, eabVar2);
                break;
            default:
                super.g(obj);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip7(jp7 jp7Var, fi0 fi0Var, hab habVar, eab eabVar, String str, wv6 wv6Var, hab habVar2, eab eabVar2) {
        super(fi0Var, habVar, eabVar, str);
        this.u0 = jp7Var;
        this.t0 = wv6Var;
        this.Z = habVar2;
        this.s0 = eabVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip7(tq7 tq7Var, fi0 fi0Var, hab habVar, eab eabVar, hab habVar2, eab eabVar2, wv6 wv6Var) {
        super(fi0Var, habVar, eabVar, "VideoThumbnailProducer");
        this.u0 = tq7Var;
        this.Z = habVar2;
        this.s0 = eabVar2;
        this.t0 = wv6Var;
    }
}
