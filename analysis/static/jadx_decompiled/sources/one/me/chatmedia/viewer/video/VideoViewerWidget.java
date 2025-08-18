package one.me.chatmedia.viewer.video;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.amf;
import defpackage.bc7;
import defpackage.cjg;
import defpackage.ck2;
import defpackage.dkf;
import defpackage.dmf;
import defpackage.dy7;
import defpackage.emf;
import defpackage.fg7;
import defpackage.fmf;
import defpackage.fs;
import defpackage.gef;
import defpackage.hob;
import defpackage.je7;
import defpackage.jkf;
import defpackage.k8a;
import defpackage.kpa;
import defpackage.nec;
import defpackage.od2;
import defpackage.oec;
import defpackage.q7c;
import defpackage.qb8;
import defpackage.rzd;
import defpackage.s0b;
import defpackage.sb8;
import defpackage.suc;
import defpackage.tu0;
import defpackage.u5e;
import defpackage.w5e;
import defpackage.w7c;
import defpackage.wcf;
import defpackage.wv6;
import defpackage.z84;
import defpackage.zm4;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\f¨\u0006\u000e"}, d2 = {"Lone/me/chatmedia/viewer/video/VideoViewerWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messageId", "", "attachId", "Lsuc;", "scopeId", "(JLjava/lang/String;Ljava/lang/String;Lz84;)V", "dmf", "chat-media-viewer_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class VideoViewerWidget extends Widget {
    public static final /* synthetic */ bc7[] u0;
    public final q7c X;
    public final q7c Y;
    public cjg Z;
    public final String a;
    public final fs b;
    public final fs c;
    public final je7 o;
    public gef s0;
    public final w5e t0;

    static {
        hob hobVar = new hob(VideoViewerWidget.class, "msgId", "getMsgId()J", 0);
        oec oecVar = nec.a;
        u0 = new bc7[]{hobVar, zr6.e(oecVar, VideoViewerWidget.class, "localAttachId", "getLocalAttachId()Ljava/lang/String;", 0), zr6.f(VideoViewerWidget.class, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0, oecVar), zr6.f(VideoViewerWidget.class, "videoPreviewView", "getVideoPreviewView()Lone/me/chatmedia/viewer/video/VideoPreviewView;", 0, oecVar), zr6.f(VideoViewerWidget.class, "videoView", "getVideoView()Lone/me/sdk/media/player/view/VideoView;", 0, oecVar)};
    }

    public VideoViewerWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = VideoViewerWidget.class.getName();
        this.b = new fs(Long.class, 0L, "chat.media.viewer.message_id");
        this.c = new fs(String.class, "", "chat.media.viewer.attach_id");
        fs fsVar = new fs(suc.class, new suc(getO()), Widget.ARG_SCOPE_ID);
        bc7 bc7Var = u0[2];
        this.o = m41getSharedViewModelcp94BC8(((suc) fsVar.a(this)).a, ck2.class, null);
        this.X = viewBinding(k8a.o);
        this.Y = viewBinding(k8a.p);
        this.t0 = new w5e(this);
    }

    public final String m0() {
        bc7 bc7Var = u0[1];
        return (String) this.c.a(this);
    }

    public final long n0() {
        bc7 bc7Var = u0[0];
        return ((Number) this.b.a(this)).longValue();
    }

    public final dmf o0() {
        Object targetController = getTargetController();
        if (targetController instanceof dmf) {
            return (dmf) targetController;
        }
        return null;
    }

    @Override // defpackage.uu3
    public final void onActivityStarted(Activity activity) {
        dmf dmfVarO0;
        dkf dkfVarB0;
        super.onActivityStarted(activity);
        if (getView() == null || this.s0 == null || (dmfVarO0 = o0()) == null || (dkfVarB0 = ((ChatMediaViewerScreen) dmfVarO0).B0()) == null || !dkfVarB0.H0()) {
            return;
        }
        p0().a(this.t0);
    }

    @Override // defpackage.uu3
    public final void onActivityStopped(Activity activity) {
        dkf dkfVarB0;
        super.onActivityStopped(activity);
        if (getView() == null || this.s0 == null) {
            return;
        }
        dmf dmfVarO0 = o0();
        if (dmfVarO0 != null && (dkfVarB0 = ((ChatMediaViewerScreen) dmfVarO0).B0()) != null) {
            dkfVarB0.pause();
            dkfVarB0.M0(null);
        }
        p0().b();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        s0b s0bVar = new s0b(getContext());
        s0bVar.setId(k8a.q);
        s0bVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        s0bVar.setTouchEventDelegate(new zm4(s0bVar.getContext(), s0bVar, new rzd(14, this), new u5e(this)));
        jkf jkfVar = new jkf(s0bVar.getContext());
        jkfVar.setId(k8a.o);
        jkfVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        s0bVar.addView(jkfVar);
        amf amfVar = new amf(s0bVar.getContext());
        amfVar.setId(k8a.p);
        amfVar.setAlpha(0.0f);
        amfVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        this.Z = new cjg(amfVar);
        s0bVar.addView(amfVar);
        return s0bVar;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        ObjectAnimator objectAnimator;
        super.onDestroyView(view);
        cjg cjgVar = this.Z;
        if (cjgVar != null && (objectAnimator = (ObjectAnimator) cjgVar.b) != null) {
            objectAnimator.cancel();
        }
        this.Z = null;
        this.s0 = null;
        p0().b();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        je7 je7Var = this.o;
        w7c w7cVar = ((ck2) je7Var.getValue()).W0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(w7cVar, getViewLifecycleOwner().Q(), fg7Var), new emf(null, this), 5), getViewLifecycleScope());
        sb8 sb8VarY = ((ck2) je7Var.getValue()).y(n0(), m0());
        qb8 qb8Var = sb8VarY instanceof qb8 ? (qb8) sb8VarY : null;
        if (qb8Var == null) {
            return;
        }
        jkf jkfVar = (jkf) this.X.T0(this, u0[3]);
        wcf wcfVar = jkfVar.D0;
        wcf wcfVar2 = qb8Var.o;
        boolean z = !wcfVar2.equals(wcfVar);
        jkfVar.D0 = wcfVar2;
        if (z) {
            jkfVar.o(wv6.a(wcfVar2.b), wv6.a(wcfVar2.h));
        }
        od2.L(new zn5(tu0.g(((ck2) je7Var.getValue()).N0, getViewLifecycleOwner().Q(), fg7Var), new fmf(null, this), 5), getViewLifecycleScope());
    }

    public final amf p0() {
        return (amf) this.Y.T0(this, u0[4]);
    }

    public VideoViewerWidget(long j, String str, String str2, z84 z84Var) {
        this(dy7.g(new kpa("chat.media.viewer.message_id", Long.valueOf(j)), new kpa("chat.media.viewer.attach_id", str), new kpa(Widget.ARG_SCOPE_ID, new suc(str2))));
    }
}
