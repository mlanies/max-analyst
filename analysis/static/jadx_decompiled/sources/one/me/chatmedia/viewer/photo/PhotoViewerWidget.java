package one.me.chatmedia.viewer.photo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.bc7;
import defpackage.ck2;
import defpackage.dy7;
import defpackage.fg7;
import defpackage.fs;
import defpackage.hob;
import defpackage.iwa;
import defpackage.jb8;
import defpackage.je7;
import defpackage.k8a;
import defpackage.kpa;
import defpackage.kwa;
import defpackage.nec;
import defpackage.od2;
import defpackage.oec;
import defpackage.q7c;
import defpackage.qqd;
import defpackage.sb8;
import defpackage.suc;
import defpackage.tu0;
import defpackage.z84;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\f¨\u0006\u000e"}, d2 = {"Lone/me/chatmedia/viewer/photo/PhotoViewerWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "messageId", "", "attachId", "Lsuc;", "scopeId", "(JLjava/lang/String;Ljava/lang/String;Lz84;)V", "jwa", "chat-media-viewer_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class PhotoViewerWidget extends Widget {
    public static final /* synthetic */ bc7[] X;
    public final fs a;
    public final fs b;
    public final je7 c;
    public final q7c o;

    static {
        hob hobVar = new hob(PhotoViewerWidget.class, "msgId", "getMsgId()J", 0);
        oec oecVar = nec.a;
        X = new bc7[]{hobVar, zr6.e(oecVar, PhotoViewerWidget.class, "localAttachId", "getLocalAttachId()Ljava/lang/String;", 0), zr6.f(PhotoViewerWidget.class, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0, oecVar), zr6.f(PhotoViewerWidget.class, "photoView", "getPhotoView()Lone/me/chatmedia/viewer/photo/PhotoView;", 0, oecVar)};
    }

    public PhotoViewerWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new fs(Long.class, 0L, "chat.media.viewer.message_id");
        this.b = new fs(String.class, "", "chat.media.viewer.attach_id");
        fs fsVar = new fs(suc.class, new suc(getL0()), Widget.ARG_SCOPE_ID);
        bc7 bc7Var = X[2];
        this.c = m41getSharedViewModelcp94BC8(((suc) fsVar.a(this)).a, ck2.class, null);
        this.o = viewBinding(k8a.h);
    }

    public final String m0() {
        bc7 bc7Var = X[1];
        return (String) this.b.a(this);
    }

    public final long n0() {
        bc7 bc7Var = X[0];
        return ((Number) this.a.a(this)).longValue();
    }

    public final iwa o0() {
        return (iwa) this.o.T0(this, X[3]);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        iwa iwaVar = new iwa(frameLayout.getContext());
        iwaVar.setId(k8a.h);
        frameLayout.addView(iwaVar);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        sb8 sb8VarY = p0().y(n0(), m0());
        jb8 jb8Var = sb8VarY instanceof jb8 ? (jb8) sb8VarY : null;
        if (jb8Var == null) {
            return;
        }
        o0().setZoomEnabled(true);
        o0().setListener(new qqd(20, this));
        p0().A(n0(), m0());
        o0().r(jb8Var.o, false);
        od2.L(new zn5(tu0.g(p0().N0, getViewLifecycleOwner().Q(), fg7.o), new kwa(null, this), 5), getViewLifecycleScope());
    }

    public final ck2 p0() {
        return (ck2) this.c.getValue();
    }

    public PhotoViewerWidget(long j, String str, String str2, z84 z84Var) {
        this(dy7.g(new kpa("chat.media.viewer.message_id", Long.valueOf(j)), new kpa("chat.media.viewer.attach_id", str), new kpa(Widget.ARG_SCOPE_ID, new suc(str2))));
    }
}
