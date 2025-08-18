package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ExecutorService;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;
import one.me.sdk.uikit.common.button.OneMeButton;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class q58 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarWidget b;

    public /* synthetic */ q58(MediaBarWidget mediaBarWidget, int i) {
        this.a = i;
        this.b = mediaBarWidget;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r1v33, types: [yb4] */
    /* JADX WARN: Type inference failed for: r1v75 */
    @Override // defpackage.k56
    public final Object invoke() {
        int i = 7;
        fg7 fg7Var = fg7.o;
        int i2 = 3;
        int i3 = 13;
        int i4 = 12;
        e5f e5fVar = e5f.a;
        MediaBarWidget mediaBarWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = MediaBarWidget.d1;
                View frameLayout = new FrameLayout(mediaBarWidget.getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(40 * fk4.d().getDisplayMetrics().density), tu0.G(4 * fk4.d().getDisplayMetrics().density));
                layoutParams.gravity = 17;
                frameLayout.setLayoutParams(layoutParams);
                frameLayout.setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 40.0f));
                frameLayout.setBackgroundColor(qp4.u0.j(frameLayout).getIcon().h);
                return frameLayout;
            case 1:
                bc7[] bc7VarArr2 = MediaBarWidget.d1;
                FrameLayout frameLayout2 = new FrameLayout(mediaBarWidget.getContext());
                frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, tu0.G(10 * fk4.d().getDisplayMetrics().density)));
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), tu0.G(6 * fk4.d().getDisplayMetrics().density), frameLayout2.getPaddingRight(), frameLayout2.getPaddingBottom());
                bc7 bc7Var = MediaBarWidget.d1[4];
                frameLayout2.addView((FrameLayout) mediaBarWidget.v0.getValue());
                return frameLayout2;
            case 2:
                bc7[] bc7VarArr3 = MediaBarWidget.d1;
                cla claVar = new cla(mediaBarWidget.getContext(), 6);
                claVar.setId(vvb.media_bar__album_chooser);
                claVar.setTitle(k0c.media_bar_recent);
                claVar.setLeftActions(new lka(new s58(mediaBarWidget, 2)));
                claVar.setTitleClickListener(new q58(mediaBarWidget, i3));
                return claVar;
            case 3:
                bc7[] bc7VarArr4 = MediaBarWidget.d1;
                w12 w12Var = new w12(mediaBarWidget.getContext());
                w12Var.setId(vvb.media_bar__primary_container);
                w12Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                return w12Var;
            case 4:
                bc7[] bc7VarArr5 = MediaBarWidget.d1;
                w12 w12Var2 = new w12(mediaBarWidget.getContext());
                w12Var2.setId(vvb.media_bar__partial_media_access_container);
                w12Var2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                return w12Var2;
            case 5:
                bc7[] bc7VarArr6 = MediaBarWidget.d1;
                ew1 ew1Var = new ew1(mediaBarWidget.getContext());
                ew1Var.setListener(mediaBarWidget);
                urb urbVar = (urb) mediaBarWidget.z0.getValue();
                ExecutorService executorServiceD = ((iba) to2.a.getAccessor().c(iba.class)).d();
                if ((ew1Var.a == null ? 0 : 1) == 0) {
                    rrb rrbVar = new rrb(ew1Var.getContext());
                    rrbVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    ew1Var.a = rrbVar;
                    w4d w4dVar = new w4d(6, ew1Var);
                    rrbVar.o = urbVar;
                    rrbVar.t0 = w4dVar;
                    rrbVar.s0 = executorServiceD;
                    rrbVar.getCameraApi().setCameraListener(new rxd(26, rrbVar));
                    od2.L(new zn5(tu0.g(urbVar.v0, lnf.a(rrbVar).Q(), fg7Var), new orb(null, rrbVar), 5), f46.J(lnf.a(rrbVar)));
                    od2.L(new zn5(tu0.g(urbVar.u0, lnf.a(rrbVar).Q(), fg7Var), new prb(null, rrbVar), 5), f46.J(lnf.a(rrbVar)));
                    od2.L(new zn5(tu0.g(urbVar.t0, lnf.a(rrbVar).Q(), fg7Var), new qrb(null, rrbVar), 5), f46.J(lnf.a(rrbVar)));
                    rrb rrbVar2 = ew1Var.a;
                    if (rrbVar2 == null) {
                        rrbVar2 = null;
                    }
                    ew1Var.addView(rrbVar2);
                    rrb rrbVar3 = ew1Var.a;
                    if (rrbVar3 == null) {
                        rrbVar3 = null;
                    }
                    rrbVar3.getCameraApi().e();
                    tu0.K(ew1Var, 300L, new c5(13, ew1Var));
                }
                od2.L(new zn5(tu0.g(mediaBarWidget.B0().C0, mediaBarWidget.getViewLifecycleOwner().Q(), fg7Var), new u58(null, ew1Var), 5), mediaBarWidget.getViewLifecycleScope());
                ew1Var.setForeground(mediaBarWidget.C0);
                return ew1Var;
            case 6:
                bc7[] bc7VarArr7 = MediaBarWidget.d1;
                u4d u4dVar = new u4d(mediaBarWidget.B0());
                od2.L(new zn5(tu0.g(mediaBarWidget.B0().x0, mediaBarWidget.getViewLifecycleOwner().Q(), fg7Var), new i68(null, u4dVar), 5), mediaBarWidget.getViewLifecycleScope());
                return u4dVar;
            case 7:
                bc7[] bc7VarArr8 = MediaBarWidget.d1;
                RecyclerView recyclerView = new RecyclerView(mediaBarWidget.getContext(), null);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
                float f = 4;
                layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(6 * fk4.d().getDisplayMetrics().density), tu0.G(f * fk4.d().getDisplayMetrics().density));
                recyclerView.setLayoutParams(layoutParams2);
                mdc itemAnimator = recyclerView.getItemAnimator();
                 = itemAnimator instanceof yb4 ? (yb4) itemAnimator : 0;
                if ( != 0) {
                    g = false;
                }
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 12.0f);
                recyclerView.setBackground(gradientDrawable);
                recyclerView.setClipToOutline(true);
                bc7 bc7Var2 = MediaBarWidget.d1[11];
                ((u4d) mediaBarWidget.H0.getValue()).Y = new en3(recyclerView, i, mediaBarWidget);
                recyclerView.getContext();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
                linearLayoutManager.o1(0);
                recyclerView.setLayoutManager(linearLayoutManager);
                return recyclerView;
            case 8:
                bc7[] bc7VarArr9 = MediaBarWidget.d1;
                ?? linearLayout = new LinearLayout(mediaBarWidget.getContext());
                linearLayout.setVerticalGravity(16);
                OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), null);
                oneMeButton.setMode(b7a.b);
                oneMeButton.setAppearance(z6a.c);
                oneMeButton.setEndIcon(Integer.valueOf(s8a.f));
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                float f2 = 8;
                layoutParams3.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f2), ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin, tu0.G(f2 * fk4.d().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin);
                oneMeButton.setLayoutParams(layoutParams3);
                tu0.K(oneMeButton, 300L, new xx5(12, mediaBarWidget));
                linearLayout.addView(oneMeButton);
                bc7 bc7Var3 = MediaBarWidget.d1[12];
                linearLayout.addView((RecyclerView) mediaBarWidget.I0.getValue());
                od2.L(new zn5(tu0.g(mediaBarWidget.B0().E0, mediaBarWidget.getViewLifecycleOwner().Q(), fg7Var), new j68(null, linearLayout, mediaBarWidget), 5), mediaBarWidget.getViewLifecycleScope());
                return linearLayout;
            case 9:
                bc7[] bc7VarArr10 = MediaBarWidget.d1;
                sv8 sv8Var = new sv8(mediaBarWidget.getContext());
                sv8Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                sv8Var.setVisibility(8);
                sv8Var.setRightOuterIconActionState(lv8.a);
                sv8Var.setInputHint(u8a.J);
                sv8Var.c.addTextChangedListener(new vf1(new s58(mediaBarWidget, 1), i, sv8Var));
                sv8Var.setRightOuterIconTouchListener(s5c.a(sv8Var.getContext(), new q58(mediaBarWidget, 10)));
                sv8Var.setLeftInnerIconTouchListener(s5c.a(sv8Var.getContext(), new q58(mediaBarWidget, 11)));
                return sv8Var;
            case 10:
                bc7[] bc7VarArr11 = MediaBarWidget.d1;
                p58 p58VarB0 = mediaBarWidget.B0();
                bc7[] bc7VarArr12 = p58.I0;
                p58VarB0.t(false);
                return e5fVar;
            case 11:
                bc7[] bc7VarArr13 = MediaBarWidget.d1;
                p58 p58VarB02 = mediaBarWidget.B0();
                bc7[] bc7VarArr14 = p58.I0;
                p58VarB02.v0.z(0);
                return e5fVar;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                bc7[] bc7VarArr15 = MediaBarWidget.d1;
                return Boolean.valueOf(mediaBarWidget.B0().s());
            case 13:
                bc7[] bc7VarArr16 = MediaBarWidget.d1;
                if (mediaBarWidget.x0().getScrollState() == d6b.c) {
                    mediaBarWidget.z0().setVisibility(0);
                    bc7[] bc7VarArr17 = MediaBarWidget.d1;
                    bc7 bc7Var4 = bc7VarArr17[18];
                    q7c q7cVar = mediaBarWidget.V0;
                    j03 j03Var = (j03) q7cVar.T0(mediaBarWidget, bc7Var4);
                    if (!tpa.f(j03Var.c(), "select_album_widget")) {
                        coc cocVar = new coc(new SelectAlbumWidget(mediaBarWidget.a, null), null, null, null, false, -1);
                        cocVar.d("select_album_widget");
                        j03Var.a.R(cocVar);
                    }
                    uu3 uu3VarB = ((j03) q7cVar.T0(mediaBarWidget, bc7VarArr17[18])).b();
                    SelectAlbumWidget selectAlbumWidget = uu3VarB instanceof SelectAlbumWidget ? (SelectAlbumWidget) uu3VarB : null;
                    if (selectAlbumWidget != null) {
                        selectAlbumWidget.p0();
                    }
                }
                return e5fVar;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                bc7[] bc7VarArr18 = MediaBarWidget.d1;
                LinearLayout linearLayout2 = new LinearLayout(mediaBarWidget.getContext());
                linearLayout2.setId(vvb.media_bar__draggable_container);
                linearLayout2.setOrientation(1);
                linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                linearLayout2.setOutlineProvider(mediaBarWidget.L0);
                linearLayout2.setForeground(mediaBarWidget.M0);
                v3c.y(new ee1(i2, , i), linearLayout2);
                bc7[] bc7VarArr19 = MediaBarWidget.d1;
                bc7 bc7Var5 = bc7VarArr19[5];
                linearLayout2.addView((FrameLayout) mediaBarWidget.w0.getValue());
                linearLayout2.addView(mediaBarWidget.A0());
                bc7 bc7Var6 = bc7VarArr19[9];
                linearLayout2.addView((w12) mediaBarWidget.B0.getValue());
                FrameLayout frameLayout3 = new FrameLayout(linearLayout2.getContext());
                frameLayout3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                bc7 bc7Var7 = bc7VarArr19[7];
                frameLayout3.addView((w12) mediaBarWidget.y0.getValue());
                frameLayout3.addView(mediaBarWidget.z0());
                linearLayout2.addView(frameLayout3);
                return linearLayout2;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return mediaBarWidget.a1;
            case 16:
                bc7[] bc7VarArr20 = MediaBarWidget.d1;
                mediaBarWidget.B0().v0.z(4);
                br7.d(mediaBarWidget.r0(), MediaBarWidget.e1, null);
                mediaBarWidget.w0().setLeftIcon(woc.a1);
                return e5fVar;
            case LangUtils.HASH_SEED /* 17 */:
                bc7[] bc7VarArr21 = MediaBarWidget.d1;
                w12 w12Var3 = new w12(mediaBarWidget.getContext());
                w12Var3.setId(vvb.media_bar__bottom_container);
                return w12Var3;
            case 18:
                bc7[] bc7VarArr22 = MediaBarWidget.d1;
                LinearLayout linearLayout3 = new LinearLayout(mediaBarWidget.getContext());
                linearLayout3.setOrientation(1);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams4.gravity = 80;
                linearLayout3.setLayoutParams(layoutParams4);
                bc7[] bc7VarArr23 = MediaBarWidget.d1;
                bc7 bc7Var8 = bc7VarArr23[13];
                linearLayout3.addView((LinearLayout) mediaBarWidget.J0.getValue());
                linearLayout3.addView(mediaBarWidget.w0());
                bc7 bc7Var9 = bc7VarArr23[16];
                linearLayout3.addView((w12) mediaBarWidget.P0.getValue());
                br7.d(linearLayout3, MediaBarWidget.e1, null);
                v3c.y(new o(3, null, 5), linearLayout3);
                linearLayout3.addOnLayoutChangeListener(new i61(i2, mediaBarWidget));
                linearLayout3.setClickable(true);
                return linearLayout3;
            case 19:
                bc7[] bc7VarArr24 = MediaBarWidget.d1;
                return tpa.a(mediaBarWidget.getContext());
            case 20:
                bc7[] bc7VarArr25 = MediaBarWidget.d1;
                return new s86(new q58(mediaBarWidget, i4));
            default:
                bc7[] bc7VarArr26 = MediaBarWidget.d1;
                w12 w12Var4 = new w12(mediaBarWidget.getContext());
                w12Var4.setId(t8a.A);
                w12Var4.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                w12Var4.setVisibility(8);
                return w12Var4;
        }
    }
}
