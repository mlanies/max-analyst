package one.me.profile.screens.avatars;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.bc7;
import defpackage.bs6;
import defpackage.dy7;
import defpackage.e2b;
import defpackage.fka;
import defpackage.fs;
import defpackage.gpc;
import defpackage.hob;
import defpackage.hv6;
import defpackage.iv6;
import defpackage.khe;
import defpackage.kpa;
import defpackage.lwa;
import defpackage.ma6;
import defpackage.nec;
import defpackage.ngg;
import defpackage.nz4;
import defpackage.oec;
import defpackage.p63;
import defpackage.q46;
import defpackage.q7c;
import defpackage.qwb;
import defpackage.r20;
import defpackage.rz6;
import defpackage.s36;
import defpackage.ssc;
import defpackage.uab;
import defpackage.wab;
import defpackage.wv6;
import defpackage.z53;
import defpackage.zr6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.zoom.ZoomableDraweeView;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0004\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0004\u0010\u000e¨\u0006\u0010"}, d2 = {"Lone/me/profile/screens/avatars/ProfileAvatarWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "", "", "urls", "(JLjava/util/List;)V", "Luab;", "model", "(Luab;)V", "wab", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ProfileAvatarWidget extends Widget {
    public static final /* synthetic */ bc7[] X;
    public final khe a;
    public final fs b;
    public final fs c;
    public final q7c o;

    static {
        hob hobVar = new hob(ProfileAvatarWidget.class, "imageId", "getImageId()J", 0);
        oec oecVar = nec.a;
        X = new bc7[]{hobVar, zr6.e(oecVar, ProfileAvatarWidget.class, "imageUrls", "getImageUrls()Ljava/util/List;", 0), zr6.f(ProfileAvatarWidget.class, "imageView", "getImageView()Lone/me/sdk/zoom/ZoomableDraweeView;", 0, oecVar)};
    }

    public ProfileAvatarWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new khe(new lwa(4, this));
        this.b = new fs(Long.class, 0L, "extra.id");
        this.c = new fs(List.class, nz4.a, "extra.urls");
        this.o = viewBinding(qwb.profile_contact_avatars_image_view);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        int i = qwb.profile_contact_avatars_image_view;
        ZoomableDraweeView zoomableDraweeView = new ZoomableDraweeView(frameLayout.getContext());
        zoomableDraweeView.setId(i);
        zoomableDraweeView.setAdjustViewBounds(true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        zoomableDraweeView.setLayoutParams(layoutParams);
        frameLayout.addView(zoomableDraweeView);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Object parentController = getParentController();
        wab wabVar = parentController instanceof wab ? (wab) parentController : null;
        bc7[] bc7VarArr = X;
        ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) this.o.T0(this, bc7VarArr[2]);
        bs6 icon = ((fka) this.a.getValue()).getIcon();
        ma6 ma6Var = new ma6(zoomableDraweeView.getResources());
        ma6Var.l = ssc.o;
        ma6Var.j = new r20(zoomableDraweeView.getContext(), 0);
        Context context = zoomableDraweeView.getContext();
        int i = gpc.w;
        int i2 = icon.f;
        ma6Var.f = ngg.u(i, i2, context);
        ma6Var.h = ngg.u(i, i2, zoomableDraweeView.getContext());
        ma6Var.b = 0;
        zoomableDraweeView.setHierarchy(ma6Var.a());
        zoomableDraweeView.setZoomEnabled(true);
        zoomableDraweeView.setOnTouchListener(new q46(new GestureDetector(zoomableDraweeView.getContext(), new p63(wabVar, 3, this)), 6));
        bc7 bc7Var = bc7VarArr[1];
        List<String> list = (List) this.c.a(this);
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        for (String str : list) {
            wv6 wv6VarB = wv6.b(str);
            if (wv6VarB == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            iv6 iv6VarO = s36.o();
            iv6VarO.getClass();
            arrayList.add(new hv6(iv6VarO, wv6VarB, str));
        }
        if (!arrayList.isEmpty()) {
            e2b e2bVar = s36.a.get();
            e2bVar.g = new rz6(arrayList, false);
            e2bVar.i = true;
            e2bVar.l = zoomableDraweeView.getController();
            zoomableDraweeView.setController(e2bVar.a());
        }
    }

    public ProfileAvatarWidget(long j, List<String> list) {
        this(dy7.g(new kpa("extra.id", Long.valueOf(j)), new kpa("extra.urls", list)));
    }

    public ProfileAvatarWidget(uab uabVar) {
        this(uabVar.a, uabVar.b);
    }
}
