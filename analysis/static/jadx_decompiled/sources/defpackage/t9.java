package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import one.me.chatscreen.ChatScreen;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.gallery.MediaGalleryWidget;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;
import one.me.sdk.messagewrite.markdown.AddLinkBottomSheet;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.stickerspreview.StickerPreviewScreen;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public class t9 extends z5b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public t9(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    @Override // defpackage.z5b
    public int a() {
        switch (this.a) {
            case 0:
                return c();
            case 1:
                return c();
            case 2:
                return 0;
            case 3:
                MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) this.b;
                u6c u6cVar = messageContextMenuBottomSheet.P0;
                if ((u6cVar == null || u6cVar.c.j() <= 8) && messageContextMenuBottomSheet.D0()) {
                    return 0;
                }
                return c();
            case 4:
                return 0;
            case 5:
                return StickerSetBottomSheet.x0((StickerSetBottomSheet) this.b);
            default:
                return 0;
        }
    }

    @Override // defpackage.z5b
    public int c() {
        int measuredHeight;
        View view;
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = AddLinkBottomSheet.x0;
                return ((AddLinkBottomSheet) widget).requireView().getMeasuredHeight() - f().getMeasuredHeight();
            case 1:
                nd2 nd2Var = BaseBottomSheetWidget.X;
                BaseBottomSheetWidget baseBottomSheetWidget = (BaseBottomSheetWidget) widget;
                return baseBottomSheetWidget.requireView().getMeasuredHeight() - baseBottomSheetWidget.p0().getMeasuredHeight();
            case 2:
                bc7[] bc7VarArr2 = MediaBarWidget.d1;
                return rh4.q(HttpStatus.SC_METHOD_NOT_ALLOWED, fk4.d().getDisplayMetrics().density, ((MediaBarWidget) widget).t0().getMeasuredHeight());
            case 3:
                bc7[] bc7VarArr3 = MessageContextMenuBottomSheet.Z0;
                MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) widget;
                if (messageContextMenuBottomSheet.D0()) {
                    measuredHeight = tu0.G(350 * fk4.d().getDisplayMetrics().density);
                    RecyclerView recyclerView = messageContextMenuBottomSheet.O0;
                    dec decVarN = recyclerView != null ? recyclerView.N(Long.MIN_VALUE) : null;
                    int iC = rh4.c(120, fk4.d().getDisplayMetrics().density, (decVarN == null || (view = decVarN.a) == null) ? 0 : view.getMeasuredHeight());
                    RecyclerView recyclerView2 = messageContextMenuBottomSheet.O0;
                    int paddingBottom = iC + (recyclerView2 != null ? recyclerView2.getPaddingBottom() : 0);
                    if (paddingBottom >= measuredHeight) {
                        measuredHeight = paddingBottom;
                    }
                } else {
                    ViewGroup viewGroup = messageContextMenuBottomSheet.N0;
                    measuredHeight = (viewGroup != null ? viewGroup.getMeasuredHeight() : f().getMeasuredHeight()) + messageContextMenuBottomSheet.Y0 + messageContextMenuBottomSheet.B0().getPaddingBottom();
                }
                int i = vc7.a;
                return vc7.b(vc7.c) ? vc7.a(messageContextMenuBottomSheet.getContext()) + (messageContextMenuBottomSheet.requireView().getMeasuredHeight() - measuredHeight) : messageContextMenuBottomSheet.requireView().getMeasuredHeight() - measuredHeight;
            case 4:
                return 0;
            case 5:
                return e();
            default:
                int iE = e();
                int i2 = iE / 2;
                bc7[] bc7VarArr4 = SuggestionsWidget.B0;
                SuggestionsWidget suggestionsWidget = (SuggestionsWidget) widget;
                kce kceVar = (kce) suggestionsWidget.B0().D0.a.getValue();
                yce yceVarB0 = suggestionsWidget.B0();
                CharSequence charSequence = (CharSequence) yceVarB0.G0.getValue();
                ((Number) yceVarB0.H0.getValue()).intValue();
                if (charSequence == null || w9e.C0(charSequence)) {
                    return iE;
                }
                List list = kceVar != null ? kceVar.b : null;
                return (list == null || list.isEmpty()) ? rh4.q(48, fk4.d().getDisplayMetrics().density, iE - suggestionsWidget.z0().getMeasuredHeight()) : Math.max(rh4.q(20, fk4.d().getDisplayMetrics().density, iE) - suggestionsWidget.A0().getMeasuredHeight(), i2);
        }
    }

    @Override // defpackage.z5b
    public View d() {
        switch (this.a) {
            case 2:
                bc7[] bc7VarArr = MediaBarWidget.d1;
                return ((MediaBarWidget) this.b).r0();
            default:
                return super.d();
        }
    }

    @Override // defpackage.z5b
    public final int e() {
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                View view = ((AddLinkBottomSheet) widget).getView();
                if (view != null) {
                    return view.getMeasuredHeight();
                }
                return 0;
            case 1:
                View view2 = ((BaseBottomSheetWidget) widget).getView();
                if (view2 != null) {
                    return view2.getMeasuredHeight();
                }
                return 0;
            case 2:
                bc7[] bc7VarArr = MediaBarWidget.d1;
                return ((MediaBarWidget) widget).t0().getMeasuredHeight();
            case 3:
                View view3 = ((MessageContextMenuBottomSheet) widget).getView();
                if (view3 != null) {
                    return view3.getMeasuredHeight();
                }
                return 0;
            case 4:
                bc7[] bc7VarArr2 = SelectAlbumWidget.Y;
                return -((SelectAlbumWidget) widget).m0().getMeasuredHeight();
            case 5:
                StickerSetBottomSheet stickerSetBottomSheet = (StickerSetBottomSheet) widget;
                View view4 = stickerSetBottomSheet.getView();
                return (view4 != null ? view4.getMeasuredHeight() : 0) - stickerSetBottomSheet.y0;
            default:
                bc7[] bc7VarArr3 = SuggestionsWidget.B0;
                return ((SuggestionsWidget) widget).p0().getMeasuredHeight();
        }
    }

    @Override // defpackage.z5b
    public final View f() {
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = AddLinkBottomSheet.x0;
                return ((AddLinkBottomSheet) widget).p0();
            case 1:
                return ((BaseBottomSheetWidget) widget).p0();
            case 2:
                bc7[] bc7VarArr2 = MediaBarWidget.d1;
                return ((MediaBarWidget) widget).t0();
            case 3:
                bc7[] bc7VarArr3 = MessageContextMenuBottomSheet.Z0;
                return ((MessageContextMenuBottomSheet) widget).p0();
            case 4:
                bc7[] bc7VarArr4 = SelectAlbumWidget.Y;
                return ((SelectAlbumWidget) widget).m0();
            case 5:
                bc7[] bc7VarArr5 = StickerSetBottomSheet.A0;
                return ((StickerSetBottomSheet) widget).p0();
            default:
                bc7[] bc7VarArr6 = SuggestionsWidget.B0;
                return ((SuggestionsWidget) widget).p0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    @Override // defpackage.z5b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.d6b g(defpackage.d6b r4, defpackage.d6b r5) {
        /*
            r3 = this;
            one.me.sdk.arch.Widget r0 = r3.b
            int r3 = r3.a
            switch(r3) {
                case 1: goto L81;
                case 2: goto L24;
                case 3: goto L18;
                case 4: goto L7;
                case 5: goto L8;
                default: goto L7;
            }
        L7:
            return r5
        L8:
            d6b r3 = defpackage.d6b.a
            if (r5 != r3) goto L13
            d6b r0 = defpackage.d6b.c
            if (r4 != r0) goto L13
            d6b r4 = defpackage.d6b.b
            goto L17
        L13:
            if (r5 != r3) goto L16
            goto L17
        L16:
            r4 = r5
        L17:
            return r4
        L18:
            d6b r3 = defpackage.d6b.a
            if (r5 != r3) goto L23
            bc7[] r3 = one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet.Z0
            one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet r0 = (one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet) r0
            r0.getClass()
        L23:
            return r5
        L24:
            d6b r3 = defpackage.d6b.c
            one.me.chatscreen.mediabar.MediaBarWidget r0 = (one.me.chatscreen.mediabar.MediaBarWidget) r0
            if (r5 != r3) goto L3d
            bc7[] r1 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            p58 r1 = r0.B0()
            w7c r1 = r1.A0
            j0e r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            v8b r2 = defpackage.v8b.b
            if (r1 != r2) goto L3d
            goto L6f
        L3d:
            if (r4 != r3) goto L5a
            d6b r3 = defpackage.d6b.b
            if (r5 != r3) goto L5a
            int r3 = defpackage.vc7.a
            int r3 = defpackage.vc7.c
            boolean r3 = defpackage.vc7.b(r3)
            if (r3 != 0) goto L6f
            bc7[] r3 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            znc r3 = r0.v0()
            boolean r3 = r3.n()
            if (r3 == 0) goto L5a
            goto L6f
        L5a:
            r5.getClass()
            d6b r3 = defpackage.d6b.a
            if (r5 == r3) goto L62
            goto L6e
        L62:
            bc7[] r3 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            p58 r3 = r0.B0()
            boolean r3 = r3.u()
            if (r3 == 0) goto L6f
        L6e:
            r4 = r5
        L6f:
            d6b r3 = defpackage.d6b.a
            if (r4 != r3) goto L80
            bc7[] r3 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            p58 r3 = r0.B0()
            x48 r5 = defpackage.x48.a
            s35 r3 = r3.w0
            defpackage.pnf.o(r3, r5)
        L80:
            return r4
        L81:
            d6b r3 = defpackage.d6b.a
            if (r5 != r3) goto L8d
            one.me.sdk.bottomsheet.BaseBottomSheetWidget r0 = (one.me.sdk.bottomsheet.BaseBottomSheetWidget) r0
            boolean r3 = r0.r0()
            if (r3 == 0) goto L8e
        L8d:
            r4 = r5
        L8e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t9.g(d6b, d6b):d6b");
    }

    @Override // defpackage.z5b
    public void h() {
        Widget widget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = AddLinkBottomSheet.x0;
                ((AddLinkBottomSheet) widget).t0();
                break;
            case 1:
                ((BaseBottomSheetWidget) widget).t0();
                break;
            case 2:
                bc7[] bc7VarArr2 = MediaBarWidget.d1;
                MediaBarWidget mediaBarWidget = (MediaBarWidget) widget;
                mediaBarWidget.p0();
                p58 p58VarB0 = mediaBarWidget.B0();
                p58VarB0.t0.n(z38.a);
                pnf.o(p58VarB0.w0, w48.a);
                t58 t58Var = mediaBarWidget.c1;
                if (t58Var != null) {
                    ((ChatScreen) t58Var).o.a();
                    break;
                }
                break;
            case 3:
                bc7[] bc7VarArr3 = MessageContextMenuBottomSheet.Z0;
                ((MessageContextMenuBottomSheet) widget).t0();
                break;
            case 4:
                bc7[] bc7VarArr4 = SelectAlbumWidget.Y;
                q3d q3dVarO0 = ((SelectAlbumWidget) widget).o0();
                pnf.o(q3dVarO0.o, h3d.a);
                break;
            case 6:
                uu3 uu3Var = (SuggestionsWidget) widget;
                uu3Var.getRouter().B(uu3Var);
                break;
        }
    }

    @Override // defpackage.z5b
    public void i() {
        switch (this.a) {
            case 2:
                bc7[] bc7VarArr = MediaBarWidget.d1;
                p58 p58VarB0 = ((MediaBarWidget) this.b).B0();
                pnf.o(p58VarB0.w0, x48.a);
                break;
        }
    }

    @Override // defpackage.z5b
    public boolean j() {
        switch (this.a) {
            case 2:
                bc7[] bc7VarArr = MediaBarWidget.d1;
                return ((MediaBarWidget) this.b).B0().u();
            default:
                return super.j();
        }
    }

    @Override // defpackage.z5b
    public void k() {
        switch (this.a) {
            case 2:
                bc7[] bc7VarArr = MediaBarWidget.d1;
                ((MediaBarWidget) this.b).q0();
                break;
        }
    }

    @Override // defpackage.z5b
    public void l(d6b d6bVar) {
        switch (this.a) {
            case 6:
                boolean z = d6bVar == d6b.c;
                bc7[] bc7VarArr = SuggestionsWidget.B0;
                SuggestionsWidget suggestionsWidget = (SuggestionsWidget) this.b;
                suggestionsWidget.x0().setVisibility(z ? 0 : 8);
                suggestionsWidget.y0().setVisibility(z ^ true ? 0 : 8);
                z15 z15VarA0 = suggestionsWidget.A0();
                ViewGroup.LayoutParams layoutParams = z15VarA0.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = tu0.G((z ? 0 : 20) * fk4.d().getDisplayMetrics().density);
                z15VarA0.setLayoutParams(marginLayoutParams);
                AppCompatTextView appCompatTextViewZ0 = suggestionsWidget.z0();
                ViewGroup.LayoutParams layoutParams2 = appCompatTextViewZ0.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = tu0.G((z ? 0 : 8) * fk4.d().getDisplayMetrics().density);
                appCompatTextViewZ0.setLayoutParams(marginLayoutParams2);
                q7c q7cVar = suggestionsWidget.t0;
                if (z) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) q7cVar.T0(suggestionsWidget, SuggestionsWidget.B0[1]);
                    float f = fk4.d().getDisplayMetrics().density * 0.0f;
                    constraintLayout.setClipToOutline(true);
                    constraintLayout.setOutlineProvider(new ix3(f));
                    return;
                }
                ConstraintLayout constraintLayout2 = (ConstraintLayout) q7cVar.T0(suggestionsWidget, SuggestionsWidget.B0[1]);
                float f2 = fk4.d().getDisplayMetrics().density * 20.0f;
                constraintLayout2.setClipToOutline(true);
                constraintLayout2.setOutlineProvider(new ix3(f2));
                return;
            default:
                return;
        }
    }

    @Override // defpackage.z5b
    public void m(int i) {
        ViewGroup viewGroup = null;
        Widget widget = this.b;
        switch (this.a) {
            case 2:
                bc7[] bc7VarArr = MediaBarWidget.d1;
                MediaBarWidget mediaBarWidget = (MediaBarWidget) widget;
                mediaBarWidget.getClass();
                float f = i;
                float fD = ote.d(f / tu0.G(48 * fk4.d().getDisplayMetrics().density), 0.0f, 1.0f);
                WindowInsets rootWindowInsets = mediaBarWidget.requireView().getRootWindowInsets();
                int i2 = rootWindowInsets != null ? x6g.f(null, rootWindowInsets).a.f(7).b : 0;
                bc7[] bc7VarArr2 = MediaBarWidget.d1;
                bc7 bc7Var = bc7VarArr2[5];
                int measuredHeight = (i2 - ((FrameLayout) mediaBarWidget.w0.getValue()).getMeasuredHeight()) - i;
                if (measuredHeight < 0) {
                    measuredHeight = 0;
                }
                LinearLayout linearLayoutT0 = mediaBarWidget.t0();
                linearLayoutT0.setPadding(linearLayoutT0.getPaddingLeft(), measuredHeight, linearLayoutT0.getPaddingRight(), linearLayoutT0.getPaddingBottom());
                mediaBarWidget.L0.b = 12.0f * fD * fk4.d().getDisplayMetrics().density;
                mediaBarWidget.t0().invalidateOutline();
                bc7 bc7Var2 = bc7VarArr2[4];
                ((FrameLayout) mediaBarWidget.v0.getValue()).setAlpha(fD);
                mediaBarWidget.A0().setShowDropdown(i <= 0);
                mediaBarWidget.F0 = f;
                MediaBarWidget.o0(mediaBarWidget);
                return;
            case 3:
                bc7[] bc7VarArr3 = MessageContextMenuBottomSheet.Z0;
                MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) widget;
                if (messageContextMenuBottomSheet.isAttached() && messageContextMenuBottomSheet.D0()) {
                    float fD2 = ote.d(i / tu0.G(76 * fk4.d().getDisplayMetrics().density), 0.0f, 1.0f);
                    if (fD2 == 1.0f) {
                        messageContextMenuBottomSheet.B0().getMeasuredHeight();
                    }
                    cla claVar = (cla) messageContextMenuBottomSheet.findViewById(ufa.c);
                    if (claVar != null) {
                        float f2 = 1 - fD2;
                        claVar.setAlpha(f2);
                        int measuredHeight2 = (int) (f2 * claVar.getMeasuredHeight());
                        RecyclerView recyclerView = messageContextMenuBottomSheet.O0;
                        if (recyclerView != null) {
                            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                            if (layoutParams == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.topMargin = measuredHeight2;
                            recyclerView.setLayoutParams(marginLayoutParams);
                        }
                        ViewGroup viewGroupB0 = messageContextMenuBottomSheet.B0();
                        ViewGroup.LayoutParams layoutParams2 = viewGroupB0.getLayoutParams();
                        if (layoutParams2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.topMargin = (int) (messageContextMenuBottomSheet.Y0 * fD2);
                        viewGroupB0.setLayoutParams(marginLayoutParams2);
                    }
                    messageContextMenuBottomSheet.X0.b = 20.0f * fD2 * fk4.d().getDisplayMetrics().density;
                    messageContextMenuBottomSheet.B0().invalidateOutline();
                    yp4 yp4Var = messageContextMenuBottomSheet.t0;
                    if (yp4Var != null) {
                        yp4Var.setAlpha(fD2);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                bc7[] bc7VarArr4 = SelectAlbumWidget.Y;
                q3d q3dVarO0 = ((SelectAlbumWidget) widget).o0();
                int measuredHeight3 = f().getMeasuredHeight() + i;
                q3dVarO0.getClass();
                pnf.o(q3dVarO0.o, new f3d(measuredHeight3));
                return;
            case 5:
                bc7[] bc7VarArr5 = StickerSetBottomSheet.A0;
                Object parentController = ((StickerSetBottomSheet) widget).getParentController();
                p3e p3eVar = parentController instanceof p3e ? (p3e) parentController : null;
                if (p3eVar != null) {
                    StickerPreviewScreen stickerPreviewScreen = (StickerPreviewScreen) p3eVar;
                    viewGroup = (ViewGroup) stickerPreviewScreen.t0.T0(stickerPreviewScreen, StickerPreviewScreen.A0[4]);
                }
                if (viewGroup == null) {
                    return;
                }
                if (i <= viewGroup.getBottom()) {
                    viewGroup.setTranslationY(i - viewGroup.getBottom());
                    return;
                } else {
                    viewGroup.setTranslationY(0.0f);
                    return;
                }
            default:
                return;
        }
    }

    @Override // defpackage.z5b
    public boolean n(float f, float f2) {
        boolean zContains;
        uge ugeVar;
        RecyclerView recyclerView;
        Widget widget = this.b;
        switch (this.a) {
            case 2:
                bc7[] bc7VarArr = MediaBarWidget.d1;
                MediaBarWidget mediaBarWidget = (MediaBarWidget) widget;
                if (mediaBarWidget.s0().z0) {
                    return false;
                }
                vha vhaVar = mediaBarWidget.u0;
                if (vhaVar == null || (ugeVar = (uge) vhaVar.a.X) == null) {
                    zContains = false;
                } else {
                    Rect rect = mpf.a;
                    mpf.d(rect, ugeVar);
                    zContains = rect.contains((int) f, (int) f2);
                }
                if (zContains) {
                    return false;
                }
                if (mediaBarWidget.z0().getVisibility() == 0) {
                    return false;
                }
                uu3 uu3VarB = mediaBarWidget.y0().b();
                MediaGalleryWidget mediaGalleryWidget = uu3VarB instanceof MediaGalleryWidget ? (MediaGalleryWidget) uu3VarB : null;
                return !(mediaGalleryWidget != null ? mediaGalleryWidget.m0().canScrollVertically(-1) : false);
            case 3:
                MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) widget;
                u6c u6cVar = messageContextMenuBottomSheet.P0;
                boolean zCanScrollVertically = (u6cVar == null || (recyclerView = u6cVar.d) == null) ? false : recyclerView.canScrollVertically(-1);
                RecyclerView recyclerView2 = messageContextMenuBottomSheet.O0;
                return ((recyclerView2 != null ? recyclerView2.canScrollVertically(-1) : false) || zCanScrollVertically) ? false : true;
            case 4:
                bc7[] bc7VarArr2 = SelectAlbumWidget.Y;
                return !((SelectAlbumWidget) widget).m0().canScrollVertically(1);
            case 5:
                bc7[] bc7VarArr3 = StickerSetBottomSheet.A0;
                StickerSetBottomSheet stickerSetBottomSheet = (StickerSetBottomSheet) widget;
                stickerSetBottomSheet.getClass();
                return ((RecyclerView) stickerSetBottomSheet.w0.T0(stickerSetBottomSheet, StickerSetBottomSheet.A0[2])).computeVerticalScrollOffset() == 0;
            case 6:
                bc7[] bc7VarArr4 = SuggestionsWidget.B0;
                return ((LinearLayoutManager) ((SuggestionsWidget) widget).A0().getLayoutManager()).T0() == 0;
            default:
                return super.n(f, f2);
        }
    }
}
