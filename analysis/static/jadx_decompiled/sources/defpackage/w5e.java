package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Surface;
import android.view.Window;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;
import one.me.stickersshowcase.StickersShowcaseScreen;
import ru.ok.tamtam.upload.workers.UploadDraftMediaWorker;

/* loaded from: classes2.dex */
public final class w5e implements t5e, w78, uq8, qj3, tlf, im7 {
    public final Object a;

    public /* synthetic */ w5e(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.tlf
    public void G(Surface surface) {
        dkf dkfVarB0;
        String str = ((VideoViewerWidget) this.a).a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "Media viewer. Video viewer, set surface " + surface, null);
        }
        dmf dmfVarO0 = ((VideoViewerWidget) this.a).o0();
        if (dmfVarO0 == null || (dkfVarB0 = ((ChatMediaViewerScreen) dmfVarO0).B0()) == null) {
            return;
        }
        dkfVarB0.M0(surface);
    }

    @Override // defpackage.tlf
    public int M0() {
        gef gefVar = ((VideoViewerWidget) this.a).s0;
        if (gefVar != null) {
            return gefVar.getHeight();
        }
        return 0;
    }

    @Override // defpackage.uq8
    public void Q(wq8 wq8Var) {
        mwe mweVar = (mwe) this.a;
        boolean zP = mweVar.o.a.p();
        Window.Callback callback = mweVar.X;
        if (zP) {
            callback.onPanelClosed(108, wq8Var);
        } else if (callback.onPreparePanel(0, null, wq8Var)) {
            callback.onMenuOpened(108, wq8Var);
        }
    }

    @Override // defpackage.tlf
    public int R() {
        gef gefVar = ((VideoViewerWidget) this.a).s0;
        if (gefVar != null) {
            return gefVar.getWidth();
        }
        return 0;
    }

    @Override // defpackage.w78
    public void a(long j, int i, int i2, int i3) throws MediaCodec.CryptoException {
        ((MediaCodec) this.a).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        Object next;
        k92 k92Var;
        uaa uaaVar;
        ly8 ly8Var = (ly8) obj;
        UploadDraftMediaWorker uploadDraftMediaWorker = (UploadDraftMediaWorker) this.a;
        uploadDraftMediaWorker.getClass();
        hm9.m("UploadDraftMediaWorker", "onUploadUpdate %s", ly8Var);
        if (ly8Var.a.a()) {
            hm9.n("UploadDraftMediaWorker", "onUploadSuccess: key = " + uploadDraftMediaWorker.d().a + ", messageUploadState = " + ly8Var);
            e52 e52VarC = uploadDraftMediaWorker.c().C(uploadDraftMediaWorker.d().a.a);
            if (e52VarC == null) {
                hm9.p("UploadDraftMediaWorker", "onUploadSuccess: chat is null", null);
                return;
            }
            uaa uaaVar2 = e52VarC.b.f0;
            if (uaaVar2 == null) {
                hm9.p("UploadDraftMediaWorker", "onUploadSuccess: draft is null", null);
                uploadDraftMediaWorker.y0 = fm7.a();
                return;
            }
            k8g k8gVarA = uaaVar2.a();
            if (k8gVarA == null) {
                hm9.p("UploadDraftMediaWorker", "onUploadSuccess: attaches is null", null);
                uploadDraftMediaWorker.y0 = fm7.a();
                return;
            }
            m20 m20VarC = k8gVarA.C();
            tpa.K(m20VarC, uploadDraftMediaWorker.d().a.b, new g7f(ly8Var, 0));
            m20VarC.c();
            ((jp4) uploadDraftMediaWorker.X.getValue()).c(uaaVar2);
            p82 p82VarC = uploadDraftMediaWorker.c();
            long j = e52VarC.a;
            Long lB = uaaVar2.b();
            p82VarC.k(j, lB != null ? lB.longValue() : 0L, uaaVar2);
            for (une uneVar : ((eoe) uploadDraftMediaWorker.Y.getValue()).i(Collections.singletonList(iua.X0))) {
                hua huaVar = uneVar.f;
                if ((huaVar instanceof hp4) && ((hp4) huaVar).o == e52VarC.a) {
                    ((eoe) uploadDraftMediaWorker.Y.getValue()).d(uneVar.a);
                }
            }
            r9d.y((s8g) uploadDraftMediaWorker.c.getValue());
            uploadDraftMediaWorker.y0 = fm7.b();
            return;
        }
        if (ly8Var.a.g != q8f.UPLOADING) {
            hm9.p("UploadDraftMediaWorker", "onUploadUpdate: failed. Unknown upload state. key = " + uploadDraftMediaWorker.d().a + ", state = " + ly8Var, null);
            uploadDraftMediaWorker.e(new Throwable("Internal error. Unknown upload state"));
            return;
        }
        ep4 ep4Var = uploadDraftMediaWorker.d().a;
        hm9.n("UploadDraftMediaWorker", "onUploadProgress: key = " + ep4Var + ", messageUploadState = " + ly8Var);
        e52 e52VarC2 = uploadDraftMediaWorker.c().C(uploadDraftMediaWorker.d().a.a);
        k8g k8gVarA2 = (e52VarC2 == null || (k92Var = e52VarC2.b) == null || (uaaVar = k92Var.f0) == null) ? null : uaaVar.a();
        String str = uploadDraftMediaWorker.d().a.b;
        if (k8gVarA2 != null && k8gVarA2.i() > 0) {
            Iterator it = ((List) k8gVarA2.a).iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (tpa.f(((l20) next).r, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (next != null) {
                uploadDraftMediaWorker.x0 = ly8Var.a.e;
                e52 e52VarC3 = uploadDraftMediaWorker.c().C(ep4Var.a);
                if (e52VarC3 == null) {
                    hm9.p("UploadDraftMediaWorker", "onUploadSuccess: chat is null", null);
                    uploadDraftMediaWorker.y0 = fm7.a();
                    return;
                }
                uaa uaaVar3 = e52VarC3.b.f0;
                if (uaaVar3 == null) {
                    hm9.p("UploadDraftMediaWorker", "onUploadSuccess: draft is null", null);
                    uploadDraftMediaWorker.y0 = fm7.a();
                    return;
                }
                k8g k8gVarA3 = uaaVar3.a();
                if (k8gVarA3 == null) {
                    hm9.p("UploadDraftMediaWorker", "onUploadSuccess: attaches is null", null);
                    uploadDraftMediaWorker.y0 = fm7.a();
                    return;
                }
                m20 m20VarC2 = k8gVarA3.C();
                tpa.K(m20VarC2, ep4Var.b, new g7f(ly8Var, 1));
                m20VarC2.c();
                ((jp4) uploadDraftMediaWorker.X.getValue()).c(uaaVar3);
                p82 p82VarC2 = uploadDraftMediaWorker.c();
                long j2 = e52VarC3.a;
                Long lB2 = uaaVar3.b();
                p82VarC2.k(j2, lB2 != null ? lB2.longValue() : 0L, uaaVar3);
                return;
            }
        }
        hm9.m("UploadDraftMediaWorker", "cancelUploadIfAttachIsDeleted: chat or attach is deleted: attachLocalId =%s, chatId = %s", uploadDraftMediaWorker.d().a.b, Long.valueOf(uploadDraftMediaWorker.d().a.a));
        uploadDraftMediaWorker.i();
    }

    @Override // defpackage.w78
    public void b() {
    }

    @Override // defpackage.t5e
    public void c(w3e w3eVar) {
        wd6 wd6Var = (wd6) ((p71) this.a).s0;
        wd6Var.getClass();
        bc7[] bc7VarArr = StickersShowcaseScreen.v0;
        i7e i7eVarN0 = ((StickersShowcaseScreen) wd6Var.b).n0();
        i7eVarN0.getClass();
        long j = w3eVar.a;
        Long lValueOf = Long.valueOf(j);
        us usVar = i7eVarN0.x0;
        x77 x77Var = (x77) usVar.get(lValueOf);
        if (x77Var == null || !x77Var.isActive()) {
            usVar.put(Long.valueOf(j), pnf.n(i7eVarN0, ((w9a) i7eVarN0.o).b(), null, new h7e(i7eVarN0, w3eVar, null), 2));
        }
    }

    @Override // defpackage.im7
    public void f(Object obj) {
        hm7 hm7Var;
        td tdVar = ((ahg) this.a).d;
        synchronized (tdVar) {
            tdVar.b = false;
            hm7Var = (hm7) ((rw4) tdVar.c).c;
        }
        if (hm7Var != null) {
            ((reg) tdVar.o).b(hm7Var, 2441);
        }
    }

    @Override // defpackage.w78
    public void flush() {
    }

    @Override // defpackage.t5e
    public void g(z2e z2eVar) {
        wd6 wd6Var = (wd6) ((p71) this.a).s0;
        wd6Var.getClass();
        y6e y6eVar = y6e.c;
        bc7[] bc7VarArr = StickersShowcaseScreen.v0;
        StickersShowcaseScreen stickersShowcaseScreen = (StickersShowcaseScreen) wd6Var.b;
        stickersShowcaseScreen.getClass();
        bc7 bc7Var = StickersShowcaseScreen.v0[0];
        long jLongValue = ((Number) stickersShowcaseScreen.a.a(stickersShowcaseScreen)).longValue();
        y6eVar.P1().b(":stickers/preview?sticker_id=" + z2eVar.a + "&chat_id=" + jLongValue, null);
    }

    @Override // defpackage.w78
    public void i(int i, rz3 rz3Var, long j, int i2) throws MediaCodec.CryptoException {
        ((MediaCodec) this.a).queueSecureInputBuffer(i, 0, (MediaCodec.CryptoInfo) rz3Var.i, j, i2);
    }

    @Override // defpackage.tlf
    public int j() {
        gef gefVar = ((VideoViewerWidget) this.a).s0;
        return 2;
    }

    @Override // defpackage.t5e
    public void k(z2e z2eVar) {
        wd6 wd6Var = (wd6) ((p71) this.a).s0;
        wd6Var.getClass();
        bc7[] bc7VarArr = StickersShowcaseScreen.v0;
        i7e i7eVarN0 = ((StickersShowcaseScreen) wd6Var.b).n0();
        long j = i7eVarN0.b;
        if (j > 0) {
            ((s8g) i7eVarN0.Z.getValue()).a(new v8d(new u8d(j, z2eVar.a, 1)));
            pnf.o(i7eVarN0.u0, g43.b);
        }
        xx6 xx6Var = (xx6) x6e.a.getAccessor().e();
        if (xx6Var != null) {
            xx6Var.f(bcd.a0(new wx6(ux6.b, 1), new wx6(ux6.Y, 1)), wuc.CHAT);
        }
    }

    @Override // defpackage.tlf
    public void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        String str = ((VideoViewerWidget) this.a).a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "Media viewer. Video viewer, surface destroyed " + surfaceTexture, null);
        }
    }

    @Override // defpackage.w78
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.a).setParameters(bundle);
    }

    @Override // defpackage.w78
    public void shutdown() {
    }

    @Override // defpackage.w78
    public void start() {
    }

    @Override // defpackage.uq8
    public boolean z(wq8 wq8Var, MenuItem menuItem) {
        return false;
    }
}
