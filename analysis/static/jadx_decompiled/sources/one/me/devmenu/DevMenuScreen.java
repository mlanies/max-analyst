package one.me.devmenu;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import defpackage.a54;
import defpackage.b54;
import defpackage.bc7;
import defpackage.bk;
import defpackage.br;
import defpackage.cfd;
import defpackage.cla;
import defpackage.coc;
import defpackage.dm;
import defpackage.e7d;
import defpackage.ei4;
import defpackage.ffd;
import defpackage.fi4;
import defpackage.fi9;
import defpackage.fk4;
import defpackage.fm;
import defpackage.foc;
import defpackage.fp3;
import defpackage.hfd;
import defpackage.hm9;
import defpackage.hp7;
import defpackage.ii4;
import defpackage.je7;
import defpackage.jwe;
import defpackage.ki4;
import defpackage.kka;
import defpackage.lfd;
import defpackage.li4;
import defpackage.mfd;
import defpackage.mn5;
import defpackage.ni4;
import defpackage.od2;
import defpackage.oyc;
import defpackage.pi4;
import defpackage.pz2;
import defpackage.r7d;
import defpackage.rw3;
import defpackage.t53;
import defpackage.tpa;
import defpackage.tu0;
import defpackage.ty3;
import defpackage.uka;
import defpackage.uu3;
import defpackage.v3c;
import defpackage.vfd;
import defpackage.wg0;
import defpackage.wha;
import defpackage.x27;
import defpackage.x53;
import defpackage.xv7;
import defpackage.y44;
import defpackage.y51;
import defpackage.y53;
import defpackage.yfa;
import defpackage.z44;
import defpackage.z53;
import defpackage.zn5;
import defpackage.znc;
import defpackage.zvb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.devmenu.utils.LongValueBottomSheet;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.sections.SectionRecyclerWidget;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/devmenu/DevMenuScreen;", "Lone/me/sdk/sections/SectionRecyclerWidget;", "Llfd;", "Lxv7;", "<init>", "()V", "dev-menu_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class DevMenuScreen extends SectionRecyclerWidget implements lfd, xv7 {
    public static final /* synthetic */ int u0 = 0;
    public final mfd X;
    public final y51 Y;
    public final List Z;
    public final x27 o;
    public final je7 s0;
    public final fi9 t0;

    public DevMenuScreen() {
        ForkJoinPool forkJoinPoolCommonPool = ForkJoinPool.commonPool();
        this.o = x27.d;
        this.X = new mfd(this, forkJoinPoolCommonPool);
        this.Y = new y51(forkJoinPoolCommonPool, 5);
        fi4 fi4Var = fi4.a;
        this.Z = fi4Var.getAccessor().a(pi4.class);
        this.s0 = fi4Var.getAccessor().d(ty3.class);
        this.t0 = new fi9();
    }

    public static vfd p0(DevMenuScreen devMenuScreen, b54 b54Var, int i, int i2, int i3) {
        int i4 = (i3 & 4) != 0 ? b54Var.c : i2;
        devMenuScreen.getClass();
        hfd ffdVar = null;
        Integer numValueOf = i4 != 0 ? Integer.valueOf(i4) : null;
        y44 y44Var = y44.e;
        fp3 fp3Var = b54Var.e;
        if (!tpa.f(fp3Var, y44Var)) {
            if (tpa.f(fp3Var, z44.e)) {
                ffdVar = cfd.a;
            } else {
                if (!(fp3Var instanceof a54)) {
                    throw new NoWhenBranchMatchedException();
                }
                ffdVar = new ffd(((a54) fp3Var).e, true);
            }
        }
        return new vfd(b54Var.a, i, b54Var.b, null, null, numValueOf, ffdVar, null, b54Var.d, 0, null, 1688);
    }

    @Override // defpackage.lfd
    public final void X(long j, boolean z) {
        Object next;
        List<pi4> list = this.Z;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        for (pi4 pi4Var : list) {
            Iterator it = ((Iterable) pi4Var.c().getValue()).iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((b54) next).a == j) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            b54 b54Var = (b54) next;
            if (b54Var != null) {
                pi4Var.d(b54Var);
                return;
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getC() {
        return this.o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lfd
    public final void i(long j) {
        Object next;
        List<pi4> list = this.Z;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        for (pi4 pi4Var : list) {
            Iterator it = ((Iterable) pi4Var.c().getValue()).iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((b54) next).a == j) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            b54 b54Var = (b54) next;
            if (b54Var != null) {
                if (!(pi4Var instanceof r7d)) {
                    pi4Var.d(b54Var);
                    return;
                }
                bc7[] bc7VarArr = BottomSheetWidget.x0;
                r7d r7dVar = (r7d) pi4Var;
                LongValueBottomSheet longValueBottomSheet = new LongValueBottomSheet(((oyc) r7dVar.e.getValue()).o(r7dVar.a, 0L), b54Var.a, r7dVar.c);
                longValueBottomSheet.setTargetController(this);
                uu3 parentController = this;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                foc focVar = parentController instanceof foc ? (foc) parentController : null;
                znc zncVarT = focVar != null ? focVar.T() : null;
                longValueBottomSheet.z0(this);
                if (zncVarT != null) {
                    coc cocVar = new coc(longValueBottomSheet, null, null, null, false, -1);
                    wg0.l(false, cocVar, true, "BottomSheetWidget");
                    zncVarT.G(cocVar);
                    return;
                }
                return;
            }
        }
    }

    @Override // one.me.sdk.sections.SectionRecyclerWidget
    /* renamed from: m0, reason: from getter */
    public final y51 getY() {
        return this.Y;
    }

    @Override // one.me.sdk.sections.SectionRecyclerWidget
    /* renamed from: n0, reason: from getter */
    public final mfd getX() {
        return this.X;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), null);
        coordinatorLayout.setId(zvb.oneme_devmenu_screen_view);
        fm fmVar = new fm(coordinatorLayout.getContext());
        fmVar.setId(zvb.oneme_devmenu_screen_view_appbar);
        fmVar.setElevation(0.0f);
        fmVar.setBackgroundColor(0);
        fmVar.setOutlineProvider(null);
        Toolbar toolbar = new Toolbar(fmVar.getContext(), null);
        toolbar.setElevation(0.0f);
        toolbar.setId(zvb.oneme_devmenu_screen_view_toolbar);
        toolbar.setLayoutParams(new t53(-1, -2));
        toolbar.setNavigationIcon((Drawable) null);
        toolbar.u(0, 0);
        cla claVar = new cla(toolbar.getContext(), 6);
        claVar.setForm(uka.a);
        claVar.setTextShimmerEnabled(false);
        claVar.setId(zvb.oneme_devmenu_screen_view_oneme_toolbar);
        claVar.setTitle("Dev menu");
        claVar.setLeftActions(new kka(new pz2(13)));
        toolbar.addView(claVar, new jwe(-1));
        fmVar.addView(toolbar, new dm(-1, -2));
        coordinatorLayout.addView(fmVar, new rw3(-1, -2));
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        View viewO0 = o0(16);
        rw3 rw3Var = new rw3(-1, -1);
        rw3Var.setMargins(((ViewGroup.MarginLayoutParams) rw3Var).leftMargin, tu0.G(12 * fk4.d().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) rw3Var).rightMargin, tu0.G(64 * fk4.d().getDisplayMetrics().density));
        rw3Var.b(new AppBarLayout$ScrollingViewBehavior(coordinatorLayout.getContext(), null));
        coordinatorLayout.addView(viewO0, rw3Var);
        v3c.y(new br(3, (Continuation) null, 5), coordinatorLayout);
        return coordinatorLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroy() {
        super.onDestroy();
        Iterator it = this.Z.iterator();
        while (it.hasNext()) {
            ((pi4) it.next()).b();
        }
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        this.t0.a();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ArrayList arrayList = new ArrayList();
        List list = this.Z;
        for (Object obj : list) {
            pi4 pi4Var = (pi4) obj;
            if ((pi4Var instanceof hp7) || (pi4Var instanceof e7d) || (pi4Var instanceof r7d)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b54 b54Var = (b54) x53.i0((List) ((pi4) it.next()).c().getValue());
            if (b54Var != null) {
                arrayList2.add(b54Var);
            }
        }
        List<b54> listX0 = x53.x0(arrayList2, new ii4(new bk(8, this), 0));
        ArrayList arrayList3 = new ArrayList(z53.S(listX0, 10));
        for (b54 b54Var2 : listX0) {
            b54 b54Var3 = (b54) this.t0.f(b54Var2.a, b54Var2);
            if (b54Var3 != null) {
                try {
                    String strB = ei4.b(b54Var2.a);
                    CharSequence charSequenceB = b54Var2.b.b(getContext());
                    SimilarDevButtonIdsException similarDevButtonIdsException = new SimilarDevButtonIdsException("Button " + strB + "/`" + ((Object) charSequenceB) + "` already added by " + ei4.b(b54Var3.a) + "/`" + ((Object) b54Var3.b.b(getContext())) + "`");
                    hm9.l("DevMenu", "similar buttons", similarDevButtonIdsException);
                    ((ty3) this.s0.getValue()).a(SimilarDevButtonIdsException.ISSUE_KEY, similarDevButtonIdsException);
                } catch (Throwable unused) {
                }
                wha whaVar = (wha) fi4.a.getAccessor().c(wha.class);
                whaVar.h("❗️ Дев меню невалидно, есть одинаковые id");
                whaVar.i();
            }
            int i = b54Var2.c;
            if (i == 0) {
                i = yfa.s;
            }
            arrayList3.add(p0(this, b54Var2, 0, i, 2));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            pi4 pi4Var2 = (pi4) obj2;
            if (!(pi4Var2 instanceof hp7) && !(pi4Var2 instanceof e7d) && !(pi4Var2 instanceof r7d)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList(z53.S(arrayList4, 10));
        Iterator it2 = arrayList4.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                y53.R();
                throw null;
            }
            arrayList5.add(new ni4(((pi4) next).c(), this, i2));
            i2 = i3;
        }
        od2.L(new zn5(new ki4((mn5[]) x53.D0(arrayList5).toArray(new mn5[0]), 0), new li4(this, arrayList3, null), 5), getLifecycleScope());
    }
}
