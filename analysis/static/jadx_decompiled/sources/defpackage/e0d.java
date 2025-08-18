package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.mediarouter.app.e;
import androidx.mediarouter.app.f;
import androidx.mediarouter.app.g;
import com.google.android.exoplayer2.ui.TrackSelectionView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;
import one.me.profile.ProfileScreen;
import one.me.sdk.permissionhost.PermissionBottomSheet;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class e0d implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e0d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        rg8 rg8Var;
        rg8 rg8Var2;
        Message messageObtain = null;
        messageObtain = null;
        int iMax = 0;
        z = false;
        boolean z = false;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                o0d o0dVar = (o0d) obj;
                if (view == o0dVar.mSearchButton) {
                    o0dVar.onSearchClicked();
                    return;
                }
                if (view == o0dVar.mCloseButton) {
                    o0dVar.onCloseClicked();
                    return;
                }
                if (view == o0dVar.mGoButton) {
                    o0dVar.onSubmitQuery();
                    return;
                } else if (view == o0dVar.mVoiceButton) {
                    o0dVar.onVoiceClicked();
                    return;
                } else {
                    if (view == o0dVar.mSearchSrcTextView) {
                        o0dVar.forceSuggestionQuery();
                        return;
                    }
                    return;
                }
            case 1:
                ((j7) obj).a();
                return;
            case 2:
                rc rcVar = (rc) obj;
                if (view == rcVar.k && (message3 = rcVar.m) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view == rcVar.o && (message2 = rcVar.q) != null) {
                    messageObtain = Message.obtain(message2);
                } else if (view == rcVar.s && (message = rcVar.u) != null) {
                    messageObtain = Message.obtain(message);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                rcVar.K.obtainMessage(1, rcVar.b).sendToTarget();
                return;
            case 3:
                ir0 ir0Var = (ir0) obj;
                if (ir0Var.v0 && ir0Var.isShowing()) {
                    if (!ir0Var.x0) {
                        TypedArray typedArrayObtainStyledAttributes = ir0Var.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        ir0Var.w0 = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        ir0Var.x0 = true;
                    }
                    if (ir0Var.w0) {
                        ir0Var.cancel();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((ChatMediaDownloadBottomSheet) obj).s0(true);
                return;
            case 5:
                MaterialCalendar materialCalendar = (MaterialCalendar) obj;
                int i = materialCalendar.p1;
                if (i == 2) {
                    materialCalendar.f1(1);
                    return;
                } else {
                    if (i == 1) {
                        materialCalendar.f1(2);
                        return;
                    }
                    return;
                }
            case 6:
                ((gg8) obj).dismiss();
                return;
            case 7:
                e eVar = (e) obj;
                pg8 pg8Var = eVar.I0;
                if (pg8Var.H0 != null) {
                    pg8Var.C0.removeMessages(2);
                }
                dh8 dh8Var = eVar.F0;
                pg8 pg8Var2 = eVar.I0;
                pg8Var2.H0 = dh8Var;
                boolean z2 = !view.isActivated();
                if (!z2) {
                    Integer num = (Integer) pg8Var2.I0.get(eVar.F0.c);
                    iMax = num == null ? 1 : Math.max(1, num.intValue());
                }
                eVar.B(z2);
                eVar.H0.setProgress(iMax);
                eVar.F0.j(iMax);
                pg8Var2.C0.sendEmptyMessageDelayed(2, 500L);
                return;
            case 8:
                kg8 kg8Var = (kg8) obj;
                eh8 eh8Var = kg8Var.L0.x0.Y;
                dh8 dh8Var2 = kg8Var.K0;
                eh8Var.getClass();
                if (dh8Var2 == null) {
                    throw new NullPointerException("route must not be null");
                }
                eh8.b();
                ah8 ah8VarC = eh8.c();
                if (!(ah8VarC.s instanceof sg8)) {
                    throw new IllegalStateException("There is no currently selected dynamic group route.");
                }
                gaa gaaVarB = ah8VarC.r.b(dh8Var2);
                if (gaaVarB != null && (rg8Var = (rg8) gaaVarB.a) != null && rg8Var.e) {
                    ((sg8) ah8VarC.s).o(Collections.singletonList(dh8Var2.b));
                }
                kg8Var.G0.setVisibility(4);
                kg8Var.H0.setVisibility(0);
                return;
            case 9:
                g gVar = (g) obj;
                boolean z3 = !gVar.D(gVar.F0);
                boolean zE = gVar.F0.e();
                ng8 ng8Var = gVar.S0;
                if (z3) {
                    eh8 eh8Var2 = ng8Var.x0.Y;
                    dh8 dh8Var3 = gVar.F0;
                    eh8Var2.getClass();
                    if (dh8Var3 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    eh8.b();
                    ah8 ah8VarC2 = eh8.c();
                    if (!(ah8VarC2.s instanceof sg8)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    gaa gaaVarB2 = ah8VarC2.r.b(dh8Var3);
                    if (Collections.unmodifiableList(ah8VarC2.r.u).contains(dh8Var3) || gaaVarB2 == null || !gaaVarB2.B()) {
                        dh8Var3.toString();
                    } else {
                        ((sg8) ah8VarC2.s).m(dh8Var3.b);
                    }
                } else {
                    eh8 eh8Var3 = ng8Var.x0.Y;
                    dh8 dh8Var4 = gVar.F0;
                    eh8Var3.getClass();
                    if (dh8Var4 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    eh8.b();
                    ah8 ah8VarC3 = eh8.c();
                    if (!(ah8VarC3.s instanceof sg8)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    gaa gaaVarB3 = ah8VarC3.r.b(dh8Var4);
                    if (!Collections.unmodifiableList(ah8VarC3.r.u).contains(dh8Var4) || gaaVarB3 == null || ((rg8Var2 = (rg8) gaaVarB3.a) != null && !rg8Var2.c)) {
                        dh8Var4.toString();
                    } else if (Collections.unmodifiableList(ah8VarC3.r.u).size() > 1) {
                        ((sg8) ah8VarC3.s).n(dh8Var4.b);
                    }
                }
                gVar.E(z3, !zE);
                if (zE) {
                    List listUnmodifiableList = Collections.unmodifiableList(ng8Var.x0.t0.u);
                    for (dh8 dh8Var5 : Collections.unmodifiableList(gVar.F0.u)) {
                        if (listUnmodifiableList.contains(dh8Var5) != z3) {
                            e eVar2 = (e) ng8Var.x0.G0.get(dh8Var5.c);
                            if (eVar2 instanceof g) {
                                ((g) eVar2).E(z3, true);
                            }
                        }
                    }
                }
                dh8 dh8Var6 = gVar.F0;
                pg8 pg8Var3 = ng8Var.x0;
                List listUnmodifiableList2 = Collections.unmodifiableList(pg8Var3.t0.u);
                int iMax2 = Math.max(1, listUnmodifiableList2.size());
                if (dh8Var6.e()) {
                    Iterator it = Collections.unmodifiableList(dh8Var6.u).iterator();
                    while (it.hasNext()) {
                        if (listUnmodifiableList2.contains((dh8) it.next()) != z3) {
                            iMax2 += z3 ? 1 : -1;
                        }
                    }
                } else {
                    iMax2 += z3 ? 1 : -1;
                }
                pg8 pg8Var4 = ng8Var.x0;
                boolean z4 = pg8Var4.d1 && Collections.unmodifiableList(pg8Var4.t0.u).size() > 1;
                boolean z5 = pg8Var3.d1 && iMax2 >= 2;
                if (z4 != z5) {
                    dec decVarM = pg8Var3.D0.M(0);
                    if (decVarM instanceof f) {
                        f fVar = (f) decVarM;
                        ng8Var.C(fVar.a, z5 ? fVar.K0 : 0);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((PermissionBottomSheet) obj).s0(true);
                return;
            case 11:
                bc7[] bc7VarArr = ProfileScreen.D0;
                cnb cnbVarR0 = ((ProfileScreen) obj).r0();
                tab tabVar = (tab) cnbVarR0.M0.getValue();
                List list = tabVar != null ? tabVar.c : null;
                pab pabVar = cnbVarR0.O0;
                if (list != null) {
                    c64 c64VarX = pabVar.x();
                    if (c64VarX != null) {
                        pnf.o(cnbVarR0.A0, c64VarX);
                        return;
                    }
                    return;
                }
                if (pabVar.b()) {
                    gcb gcbVar = (gcb) cnbVarR0.G0.getValue();
                    gcbVar.getClass();
                    eqe eqeVar = new eqe(yea.a0);
                    kl7 kl7VarL = j1e.l();
                    kl7VarL.add(new mg3(wea.o, new eqe(yea.c0), 3, false));
                    kl7VarL.add(new mg3(wea.n, new eqe(yea.b0), 3, false));
                    kl7VarL.add(gcbVar.b());
                    pnf.o(cnbVarR0.z0, new vlb(eqeVar, null, j1e.d(kl7VarL), null));
                    return;
                }
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((RecordExitBottomSheet) obj).s0(true);
                return;
            case 13:
                iwe iweVar = ((Toolbar) obj).a1;
                br8 br8Var = iweVar != null ? iweVar.b : null;
                if (br8Var != null) {
                    br8Var.collapseActionView();
                    return;
                }
                return;
            default:
                TrackSelectionView trackSelectionView = (TrackSelectionView) obj;
                CheckedTextView checkedTextView = trackSelectionView.a;
                SparseArray sparseArray = trackSelectionView.c;
                CheckedTextView checkedTextView2 = trackSelectionView.b;
                if (view == checkedTextView) {
                    trackSelectionView.t0 = true;
                    sparseArray.clear();
                } else {
                    if (view != checkedTextView2) {
                        trackSelectionView.t0 = false;
                        Object tag = view.getTag();
                        tag.getClass();
                        zr6.o(tag);
                        throw null;
                    }
                    trackSelectionView.t0 = false;
                    sparseArray.clear();
                }
                trackSelectionView.a.setChecked(trackSelectionView.t0);
                if (!trackSelectionView.t0 && sparseArray.size() == 0) {
                    z = true;
                }
                checkedTextView2.setChecked(z);
                throw null;
        }
    }
}
