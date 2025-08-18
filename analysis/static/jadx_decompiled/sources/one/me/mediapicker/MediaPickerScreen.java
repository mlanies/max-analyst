package one.me.mediapicker;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.ad0;
import defpackage.bc7;
import defpackage.bvc;
import defpackage.cda;
import defpackage.cla;
import defpackage.coc;
import defpackage.d86;
import defpackage.dy7;
import defpackage.fg7;
import defpackage.fkc;
import defpackage.fm9;
import defpackage.fs;
import defpackage.gkc;
import defpackage.glc;
import defpackage.hm9;
import defpackage.hob;
import defpackage.hs;
import defpackage.j78;
import defpackage.je7;
import defpackage.kpa;
import defpackage.le8;
import defpackage.me8;
import defpackage.ne8;
import defpackage.nec;
import defpackage.nj4;
import defpackage.od2;
import defpackage.oe8;
import defpackage.oi9;
import defpackage.pe8;
import defpackage.q3d;
import defpackage.q7c;
import defpackage.qm0;
import defpackage.s86;
import defpackage.te8;
import defpackage.tu0;
import defpackage.uu3;
import defpackage.w12;
import defpackage.w7c;
import defpackage.x27;
import defpackage.y53;
import defpackage.z7b;
import defpackage.zn5;
import defpackage.znc;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/mediapicker/MediaPickerScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Ld86;", "galleryMode", "(Ld86;)V", "media-picker_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class MediaPickerScreen extends Widget {
    public static final /* synthetic */ bc7[] B0 = {new hob(MediaPickerScreen.class, "primaryRouter", "getPrimaryRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), z7b.g(nec.a, MediaPickerScreen.class, "galleryMode", "getGalleryMode()Lone/me/sdk/gallery/GalleryMode;", 0), new hob(MediaPickerScreen.class, "selectedAlbumRouter", "getSelectedAlbumRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new hob(MediaPickerScreen.class, "selectedAlbumContainer", "getSelectedAlbumContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new oi9(MediaPickerScreen.class, "maxHeightAlbumsContent", "getMaxHeightAlbumsContent()I"), new hob(MediaPickerScreen.class, "mediaPickerContainer", "getMediaPickerContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new hob(MediaPickerScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new hob(MediaPickerScreen.class, "divider", "getDivider()Landroid/view/View;", 0), new hob(MediaPickerScreen.class, "contentContainer", "getContentContainer()Landroid/widget/FrameLayout;", 0)};
    public final qm0 A0;
    public final glc X;
    public final je7 Y;
    public final je7 Z;
    public final x27 a;
    public final q7c b;
    public final String c;
    public final fs o;
    public final je7 s0;
    public final q7c t0;
    public final qm0 u0;
    public final fs v0;
    public final qm0 w0;
    public final qm0 x0;
    public final qm0 y0;
    public final q7c z0;

    public MediaPickerScreen(d86 d86Var) {
        this(dy7.g(new kpa("gallery_mode_args", d86Var)));
    }

    public static final void m0(MediaPickerScreen mediaPickerScreen, boolean z) {
        qm0 qm0Var = mediaPickerScreen.A0;
        if (z) {
            ((View) qm0Var.getValue()).setVisibility(0);
        } else if (qm0Var.a()) {
            ((TextView) qm0Var.getValue()).setVisibility(8);
        }
        bc7 bc7Var = B0[5];
        ((w12) mediaPickerScreen.w0.getValue()).setVisibility(z ^ true ? 0 : 8);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getB() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getO() {
        return this.c;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScreenDelegate */
    public final bvc getF0() {
        return this.X;
    }

    public final d86 n0() {
        bc7 bc7Var = B0[1];
        return (d86) this.o.a(this);
    }

    public final cla o0() {
        bc7 bc7Var = B0[6];
        return (cla) this.x0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uu3
    public final void onActivityResult(int i, int i2, Intent intent) {
        Rect rect;
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (i == 666 && i2 == -1 && (!n0().c)) {
            ad0 ad0Var = null;
            if (intent == null) {
                hm9.p(MediaPickerScreen.class.getName(), "ActAvatarCrop sent empty data", null);
                return;
            }
            RectF rectF = (RectF) ((Parcelable) fm9.D(intent, "ru.ok.tamtam.extra.CROPPED_RECT", RectF.class));
            if (rectF == null || (rect = (Rect) ((Parcelable) fm9.D(intent, "ru.ok.tamtam.extra.CROPPED_ABSOLUTE", Rect.class))) == null || (stringExtra = intent.getStringExtra("ru.ok.tamtam.extra.FILE_PATH")) == null) {
                return;
            }
            znc router = getRouter();
            hs hsVar = new hs();
            hsVar.b(router);
            loop0: while (true) {
                if (!(!hsVar.isEmpty())) {
                    break;
                }
                znc zncVar = (znc) hsVar.k();
                for (int iL = y53.L(zncVar.e()); -1 < iL; iL--) {
                    uu3 uu3Var = ((coc) zncVar.e().get(iL)).a;
                    if (uu3Var instanceof ad0) {
                        ad0Var = uu3Var;
                        break loop0;
                    }
                    Iterator it = new gkc(uu3Var.getChildRouters()).iterator();
                    while (true) {
                        ListIterator listIterator = ((fkc) it).b;
                        if (!listIterator.hasPrevious()) {
                            break;
                        } else {
                            hsVar.b((znc) listIterator.previous());
                        }
                    }
                }
            }
            ad0 ad0Var2 = ad0Var;
            if (ad0Var2 != null) {
                ad0Var2.a(stringExtra, rectF, rect);
            }
            getRouter().C();
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(o0());
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        frameLayout.setId(cda.c);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setGravity(17);
        bc7[] bc7VarArr = B0;
        bc7 bc7Var = bc7VarArr[5];
        frameLayout.addView((w12) this.w0.getValue());
        bc7 bc7Var2 = bc7VarArr[3];
        frameLayout.addView((w12) this.u0.getValue());
        bc7 bc7Var3 = bc7VarArr[7];
        frameLayout.addView((View) this.y0.getValue());
        linearLayout.addView(frameLayout);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        je7 je7Var = this.s0;
        w7c w7cVar = ((te8) je7Var.getValue()).w0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(w7cVar, getViewLifecycleOwner().Q(), fg7Var), new me8(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((s86) this.Y.getValue()).c, getViewLifecycleOwner().Q(), fg7Var), new ne8(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((te8) je7Var.getValue()).v0, getViewLifecycleOwner().Q(), fg7Var), new oe8(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((q3d) this.Z.getValue()).o, getViewLifecycleOwner().Q(), fg7Var), new pe8(null, this), 5), getViewLifecycleScope());
    }

    public MediaPickerScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = x27.d;
        this.b = childSlotRouter(cda.b);
        this.c = "MediaPickerScreenScopeId";
        this.o = new fs(d86.class, "gallery_mode_args");
        this.X = new glc(new j78(2), null, 6);
        this.Y = createViewModelLazy(s86.class, new nj4(26, new j78(3)));
        this.Z = createViewModelLazy(q3d.class, new nj4(27, new le8(this, 1)));
        this.s0 = createViewModelLazy(te8.class, new nj4(28, new le8(this, 2)));
        this.t0 = childSlotRouter(cda.a);
        this.u0 = binding(new le8(this, 3));
        this.v0 = new fs(Integer.class, 0, "max_height_albums_content");
        this.w0 = binding(new le8(this, 4));
        this.x0 = binding(new le8(this, 5));
        this.y0 = binding(new le8(this, 6));
        this.z0 = viewBinding(cda.c);
        this.A0 = binding(new le8(this, 7));
    }
}
