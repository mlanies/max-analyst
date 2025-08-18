package one.me.sdk.gallery;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import defpackage.ay7;
import defpackage.bc7;
import defpackage.d86;
import defpackage.dy7;
import defpackage.fua;
import defpackage.gga;
import defpackage.hm9;
import defpackage.hob;
import defpackage.hp1;
import defpackage.i24;
import defpackage.j81;
import defpackage.je7;
import defpackage.k56;
import defpackage.khe;
import defpackage.kpa;
import defpackage.na8;
import defpackage.nec;
import defpackage.nj4;
import defpackage.oa8;
import defpackage.od2;
import defpackage.p76;
import defpackage.p86;
import defpackage.pa8;
import defpackage.pnf;
import defpackage.qa8;
import defpackage.qm0;
import defpackage.s15;
import defpackage.s86;
import defpackage.sc1;
import defpackage.suc;
import defpackage.tpa;
import defpackage.w86;
import defpackage.yb4;
import defpackage.yf3;
import defpackage.z15;
import defpackage.z84;
import defpackage.z96;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.gallery.MediaGalleryWidget;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/sdk/gallery/MediaGalleryWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "Ld86;", "galleryMode", "(Ljava/lang/String;Ld86;Lz84;)V", "media-gallery-widget_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class MediaGalleryWidget extends Widget {
    public static final /* synthetic */ bc7[] Z;
    public final qm0 X;
    public final j81 Y;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final khe o;

    static {
        hob hobVar = new hob(MediaGalleryWidget.class, "galleryRecyclerView", "getGalleryRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView;", 0);
        nec.a.getClass();
        Z = new bc7[]{hobVar};
    }

    public MediaGalleryWidget(String str, d86 d86Var, z84 z84Var) {
        this(dy7.g(new kpa("arg_scope_id", new suc(str)), new kpa("arg_gallery_mode", d86Var)));
    }

    public final z15 m0() {
        bc7 bc7Var = Z[0];
        return (z15) this.X.getValue();
    }

    public final s86 n0() {
        return (s86) this.b.getValue();
    }

    public final z96 o0() {
        return (z96) this.c.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(m0());
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) throws Resources.NotFoundException {
        int i = 4;
        int i2 = 1;
        super.onViewCreated(view);
        z96 z96VarO0 = o0();
        w86 w86VarA = tpa.a(z96VarO0.c);
        z96VarO0.y0 = w86VarA;
        hm9.n("z96", "did recalculate uiOptions: " + w86VarA);
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new hp1(this, i2, view));
        } else {
            int i3 = o0().y0.c;
            int width = (view.getWidth() / i3) - (o0().y0.d - (o0().y0.d / i3));
            s86 s86VarN0 = n0();
            s86VarN0.getClass();
            pnf.o(s86VarN0.c, new p86(width));
        }
        z15 z15VarM0 = m0();
        z15VarM0.setPager(this.Y);
        z15VarM0.setProgressView(gga.a);
        z15VarM0.setHasFixedSize(true);
        z15VarM0.setThreshold(o0().y0.b);
        z15VarM0.setAdapter((p76) this.o.getValue());
        z15VarM0.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(o0().y0.c);
        gridLayoutManager.C = o0().y0.c * 4;
        z15VarM0.setLayoutManager(gridLayoutManager);
        z15VarM0.j(new sc1(o0().y0.c, o0().y0.d, i));
        z15VarM0.setItemAnimator(o0().y0.g ? new yb4() : null);
        z15VarM0.m(new s15(3, this));
        od2.L(new zn5(o0().x0, new na8(this, null), 5), getViewLifecycleScope());
        od2.L(new zn5(o0().E0, new oa8(this, null), 5), getViewLifecycleScope());
        od2.L(new zn5(o0().A0, new pa8(this, null), 5), getViewLifecycleScope());
        i24.s(new zn5(n0().o, new qa8(this, null), 5), getViewLifecycleScope());
    }

    public MediaGalleryWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = fua.a.b();
        Object objV = ay7.v(bundle, "arg_scope_id", suc.class);
        if (objV != null) {
            this.b = m41getSharedViewModelcp94BC8(((suc) ((Parcelable) objV)).a, s86.class, null);
            this.c = createViewModelLazy(z96.class, new nj4(25, new yf3(bundle, 15, this)));
            final int i = 0;
            this.o = new khe(new k56(this) { // from class: ma8
                public final /* synthetic */ MediaGalleryWidget b;

                {
                    this.b = this;
                }

                @Override // defpackage.k56
                public final Object invoke() {
                    MediaGalleryWidget mediaGalleryWidget = this.b;
                    switch (i) {
                        case 0:
                            bc7[] bc7VarArr = MediaGalleryWidget.Z;
                            return new p76(mediaGalleryWidget.o0());
                        default:
                            bc7[] bc7VarArr2 = MediaGalleryWidget.Z;
                            z15 z15Var = new z15(mediaGalleryWidget.getContext(), null);
                            z15Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            return z15Var;
                    }
                }
            });
            final int i2 = 1;
            this.X = binding(new k56(this) { // from class: ma8
                public final /* synthetic */ MediaGalleryWidget b;

                {
                    this.b = this;
                }

                @Override // defpackage.k56
                public final Object invoke() {
                    MediaGalleryWidget mediaGalleryWidget = this.b;
                    switch (i2) {
                        case 0:
                            bc7[] bc7VarArr = MediaGalleryWidget.Z;
                            return new p76(mediaGalleryWidget.o0());
                        default:
                            bc7[] bc7VarArr2 = MediaGalleryWidget.Z;
                            z15 z15Var = new z15(mediaGalleryWidget.getContext(), null);
                            z15Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            return z15Var;
                    }
                }
            });
            this.Y = new j81(this, 4);
            return;
        }
        throw new IllegalArgumentException(zr6.i("No value passed for key arg_scope_id of type ", suc.class.getSimpleName(), " in bundle").toString());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MediaGalleryWidget(String str, d86 d86Var, int i, z84 z84Var) {
        if ((i & 2) != 0) {
            Parcelable.Creator<d86> creator = d86.CREATOR;
            d86Var = d86.t0;
        }
        this(str, d86Var, null);
    }
}
