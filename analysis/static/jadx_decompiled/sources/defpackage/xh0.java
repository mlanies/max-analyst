package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class xh0 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xh0(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        switch (this.X) {
            case 0:
                xh0 xh0Var = new xh0((BaseBottomSheetWidget) this.Z, (Continuation) obj3, 0);
                xh0Var.Y = (fka) obj2;
                e5f e5fVar = e5f.a;
                xh0Var.o(e5fVar);
                return e5fVar;
            case 1:
                xh0 xh0Var2 = new xh0(3, (Continuation) obj3, 1);
                xh0Var2.Y = (Long) obj;
                xh0Var2.Z = (d04) obj2;
                return xh0Var2.o(e5f.a);
            case 2:
                xh0 xh0Var3 = new xh0((pl2) this.Z, (Continuation) obj3, 2);
                xh0Var3.Y = (fka) obj2;
                e5f e5fVar2 = e5f.a;
                xh0Var3.o(e5fVar2);
                return e5fVar2;
            case 3:
                xh0 xh0Var4 = new xh0(3, (Continuation) obj3, 3);
                xh0Var4.Y = (ls2) obj;
                xh0Var4.Z = (tzc) obj2;
                return xh0Var4.o(e5f.a);
            case 4:
                xh0 xh0Var5 = new xh0(3, (Continuation) obj3, 4);
                xh0Var5.Z = (xh4) obj;
                xh0Var5.Y = (fka) obj2;
                e5f e5fVar3 = e5f.a;
                xh0Var5.o(e5fVar3);
                return e5fVar3;
            case 5:
                xh0 xh0Var6 = new xh0((gw2) this.Z, (Continuation) obj3, 5);
                xh0Var6.Y = (Throwable) obj2;
                e5f e5fVar4 = e5f.a;
                xh0Var6.o(e5fVar4);
                return e5fVar4;
            case 6:
                xh0 xh0Var7 = new xh0(3, (Continuation) obj3, 6);
                xh0Var7.Y = (mt2) obj;
                xh0Var7.Z = (List) obj2;
                return xh0Var7.o(e5f.a);
            case 7:
                xh0 xh0Var8 = new xh0((tt3) this.Z, (Continuation) obj3, 7);
                xh0Var8.Y = (TextView) obj;
                e5f e5fVar5 = e5f.a;
                xh0Var8.o(e5fVar5);
                return e5fVar5;
            case 8:
                xh0 xh0Var9 = new xh0(3, (Continuation) obj3, 8);
                xh0Var9.Z = (n04) obj;
                xh0Var9.Y = (fka) obj2;
                e5f e5fVar6 = e5f.a;
                xh0Var9.o(e5fVar6);
                return e5fVar6;
            case 9:
                xh0 xh0Var10 = new xh0(3, (Continuation) obj3, 9);
                xh0Var10.Y = (meb) obj;
                xh0Var10.Z = (List) obj2;
                return xh0Var10.o(e5f.a);
            case 10:
                xh0 xh0Var11 = new xh0((ky4) this.Y, (Context) this.Z, (Continuation) obj3, 10);
                e5f e5fVar7 = e5f.a;
                xh0Var11.o(e5fVar7);
                return e5fVar7;
            case 11:
                xh0 xh0Var12 = new xh0((rl5) this.Z, (Continuation) obj3, 11);
                xh0Var12.Y = (fka) obj2;
                e5f e5fVar8 = e5f.a;
                xh0Var12.o(e5fVar8);
                return e5fVar8;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                xh0 xh0Var13 = new xh0((tt5) this.Z, (Continuation) obj3, 12);
                xh0Var13.Y = (fka) obj2;
                e5f e5fVar9 = e5f.a;
                xh0Var13.o(e5fVar9);
                return e5fVar9;
            case 13:
                xh0 xh0Var14 = new xh0(3, (Continuation) obj3, 13);
                xh0Var14.Z = (ConstraintLayout) obj;
                xh0Var14.Y = (fka) obj2;
                e5f e5fVar10 = e5f.a;
                xh0Var14.o(e5fVar10);
                return e5fVar10;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                xh0 xh0Var15 = new xh0(3, (Continuation) obj3, 14);
                xh0Var15.Z = (csb) obj;
                xh0Var15.Y = (fka) obj2;
                e5f e5fVar11 = e5f.a;
                xh0Var15.o(e5fVar11);
                return e5fVar11;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                xh0 xh0Var16 = new xh0((InviteByQrBottomSheet) this.Z, (Continuation) obj3, 15);
                xh0Var16.Y = (fka) obj2;
                e5f e5fVar12 = e5f.a;
                xh0Var16.o(e5fVar12);
                return e5fVar12;
            case 16:
                xh0 xh0Var17 = new xh0((ae7) this.Z, (Continuation) obj3, 16);
                xh0Var17.Y = (fka) obj2;
                e5f e5fVar13 = e5f.a;
                xh0Var17.o(e5fVar13);
                return e5fVar13;
            case LangUtils.HASH_SEED /* 17 */:
                xh0 xh0Var18 = new xh0(3, (Continuation) obj3, 17);
                xh0Var18.Z = (vf7) obj;
                xh0Var18.Y = (fka) obj2;
                e5f e5fVar14 = e5f.a;
                xh0Var18.o(e5fVar14);
                return e5fVar14;
            case 18:
                xh0 xh0Var19 = new xh0(3, (Continuation) obj3, 18);
                xh0Var19.Y = (Long) obj;
                xh0Var19.Z = (String) obj2;
                return xh0Var19.o(e5f.a);
            case 19:
                xh0 xh0Var20 = new xh0((qy8) this.Y, (View) this.Z, (Continuation) obj3, 19);
                e5f e5fVar15 = e5f.a;
                xh0Var20.o(e5fVar15);
                return e5fVar15;
            case 20:
                xh0 xh0Var21 = new xh0(3, (Continuation) obj3, 20);
                xh0Var21.Y = (e52) obj;
                xh0Var21.Z = (l29) obj2;
                return xh0Var21.o(e5f.a);
            case 21:
                xh0 xh0Var22 = new xh0((MessagesListWidget) this.Z, (Continuation) obj3, 21);
                xh0Var22.Y = (EndlessRecyclerView2) obj;
                e5f e5fVar16 = e5f.a;
                xh0Var22.o(e5fVar16);
                return e5fVar16;
            case 22:
                xh0 xh0Var23 = new xh0(3, (Continuation) obj3, 22);
                xh0Var23.Z = (cmd) obj;
                xh0Var23.Y = (fka) obj2;
                e5f e5fVar17 = e5f.a;
                xh0Var23.o(e5fVar17);
                return e5fVar17;
            case 23:
                xh0 xh0Var24 = new xh0(3, (Continuation) obj3, 23);
                xh0Var24.Y = (j4d) obj;
                xh0Var24.Z = (l2b) obj2;
                return xh0Var24.o(e5f.a);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                xh0 xh0Var25 = new xh0((Context) this.Z, (Continuation) obj3, 24);
                xh0Var25.Y = (aba) obj;
                e5f e5fVar18 = e5f.a;
                xh0Var25.o(e5fVar18);
                return e5fVar18;
            case 25:
                xh0 xh0Var26 = new xh0(3, (Continuation) obj3, 25);
                xh0Var26.Z = (pha) obj;
                xh0Var26.Y = (fka) obj2;
                e5f e5fVar19 = e5f.a;
                xh0Var26.o(e5fVar19);
                return e5fVar19;
            case 26:
                xh0 xh0Var27 = new xh0(3, (Continuation) obj3, 26);
                xh0Var27.Z = (eb9) obj;
                xh0Var27.Y = (fka) obj2;
                e5f e5fVar20 = e5f.a;
                xh0Var27.o(e5fVar20);
                return e5fVar20;
            case 27:
                xh0 xh0Var28 = new xh0(3, (Continuation) obj3, 27);
                xh0Var28.Z = (pea) obj;
                xh0Var28.Y = (fka) obj2;
                e5f e5fVar21 = e5f.a;
                xh0Var28.o(e5fVar21);
                return e5fVar21;
            case 28:
                xh0 xh0Var29 = new xh0(3, (Continuation) obj3, 28);
                xh0Var29.Z = (k5f) obj;
                xh0Var29.Y = (fka) obj2;
                e5f e5fVar22 = e5f.a;
                xh0Var29.o(e5fVar22);
                return e5fVar22;
            default:
                xh0 xh0Var30 = new xh0((ShapeDrawable) this.Z, (Continuation) obj3, 29);
                xh0Var30.Y = (fka) obj2;
                e5f e5fVar23 = e5f.a;
                xh0Var30.o(e5fVar23);
                return e5fVar23;
        }
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        int iC;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                fka fkaVar = (fka) this.Y;
                BaseBottomSheetWidget baseBottomSheetWidget = (BaseBottomSheetWidget) this.Z;
                fka fkaVarQ0 = baseBottomSheetWidget.q0();
                if (fkaVarQ0 != null) {
                    fkaVar = fkaVarQ0;
                }
                baseBottomSheetWidget.p0().setBackground(new ColorDrawable(fkaVar.b().g));
                break;
            case 1:
                od2.a0(obj);
                Long l = (Long) this.Y;
                if (((d04) this.Z).j instanceof g95) {
                }
                break;
            case 2:
                od2.a0(obj);
                fka fkaVar2 = (fka) this.Y;
                pl2 pl2Var = (pl2) this.Z;
                pl2Var.F0.onThemeChanged(fkaVar2);
                je7 je7Var = pl2Var.G0;
                if (je7Var.a()) {
                    ((TextView) je7Var.getValue()).setTextColor(fkaVar2.getText().b);
                }
                break;
            case 3:
                od2.a0(obj);
                break;
            case 4:
                od2.a0(obj);
                ((xh4) this.Z).onThemeChanged((fka) this.Y);
                break;
            case 5:
                od2.a0(obj);
                Throwable th = (Throwable) this.Y;
                if (!(th instanceof CancellationException)) {
                    hm9.p(((gw2) this.Z).J0, "observeChatsAndPresences fail", th);
                }
                break;
            case 6:
                od2.a0(obj);
                break;
            case 7:
                od2.a0(obj);
                TextView textView = (TextView) this.Y;
                Integer num = ((tt3) this.Z).c;
                pq9 pq9Var = qp4.u0;
                if (num != null) {
                    iC = pq9Var.j(textView).c(num.intValue());
                } else {
                    iC = pq9Var.j(textView).getText().e;
                }
                textView.setTextColor(iC);
                break;
            case 8:
                od2.a0(obj);
                n04 n04Var = (n04) this.Z;
                fka fkaVar3 = (fka) this.Y;
                n04Var.b.setTextColor(fkaVar3.getText().e);
                EditText editText = n04Var.b;
                editText.setHintTextColor(fkaVar3.getText().i);
                editText.setBackground(null);
                n04Var.c.setTextColor(fkaVar3.getText().g);
                n04Var.setBackgroundColor(fkaVar3.b().a.h);
                break;
            case 9:
                od2.a0(obj);
                break;
            case 10:
                od2.a0(obj);
                ky4 ky4Var = (ky4) this.Y;
                ngg.G(ky4Var.F0, qp4.u0.b((Context) this.Z).i().b().a.g);
                d02 d02Var = ky4Var.J0;
                if (d02Var != null) {
                    ky4Var.E(d02Var.c);
                }
                break;
            case 11:
                od2.a0(obj);
                fka fkaVar4 = (fka) this.Y;
                rl5 rl5Var = (rl5) this.Z;
                AppCompatEditText appCompatEditText = rl5Var.F0;
                appCompatEditText.setTextColor(fkaVar4.getText().e);
                appCompatEditText.setHintTextColor(fkaVar4.getText().i);
                appCompatEditText.setBackgroundColor(fkaVar4.b().g);
                je7 je7Var2 = rl5Var.G0;
                if (je7Var2.a()) {
                    ((AppCompatTextView) je7Var2.getValue()).setTextColor(fkaVar4.getText().b);
                }
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                od2.a0(obj);
                ((tt5) this.Z).F0.onThemeChanged((fka) this.Y);
                break;
            case 13:
                od2.a0(obj);
                ((ConstraintLayout) this.Z).setBackgroundColor(((fka) this.Y).b().k);
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                od2.a0(obj);
                csb csbVar = (csb) this.Z;
                fka fkaVar5 = (fka) this.Y;
                csbVar.setBackgroundColor(qp4.u0.j(csbVar).a().h().a.d);
                csbVar.onThemeChanged(fkaVar5);
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                od2.a0(obj);
                fka fkaVar6 = (fka) this.Y;
                InviteByQrBottomSheet inviteByQrBottomSheet = (InviteByQrBottomSheet) this.Z;
                InviteByQrBottomSheet.A0(inviteByQrBottomSheet).setTextColor(fkaVar6.getText().e);
                InviteByQrBottomSheet.B0(inviteByQrBottomSheet).setTextColor(fkaVar6.getText().g);
                break;
            case 16:
                od2.a0(obj);
                fka fkaVar7 = (fka) this.Y;
                ae7 ae7Var = (ae7) this.Z;
                AppCompatEditText appCompatEditText2 = ae7Var.F0;
                appCompatEditText2.setTextColor(fkaVar7.getText().e);
                appCompatEditText2.setHintTextColor(fkaVar7.getText().i);
                appCompatEditText2.setBackgroundColor(fkaVar7.b().g);
                je7 je7Var3 = ae7Var.G0;
                if (je7Var3.a()) {
                    ((AppCompatTextView) je7Var3.getValue()).setTextColor(fkaVar7.getText().b);
                }
                break;
            case LangUtils.HASH_SEED /* 17 */:
                od2.a0(obj);
                ((vf7) this.Z).c.setImageTintList(ColorStateList.valueOf(((fka) this.Y).getText().e));
                break;
            case 18:
                od2.a0(obj);
                Long l2 = (Long) this.Y;
                String str = (String) this.Z;
                if (l2 != null && l2.longValue() == -1) {
                    str = null;
                }
                if (str != null) {
                    break;
                }
                break;
            case 19:
                od2.a0(obj);
                qy8 qy8Var = (qy8) this.Y;
                ry8 ry8Var = qy8Var.H0;
                if (ry8Var != null) {
                    boolean zB = ns0.b(ry8Var.a & 2080374784);
                    nr2 nr2VarA = qp4.u0.j((View) this.Z).a();
                    qy8Var.a(nr2VarA.d(zB));
                    qy8Var.e(nr2VarA.s());
                }
                break;
            case 20:
                od2.a0(obj);
                break;
            case 21:
                od2.a0(obj);
                EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) this.Y;
                h8e h8eVar = ((MessagesListWidget) this.Z).H0;
                if (h8eVar != null) {
                    h8eVar.j();
                }
                endlessRecyclerView2.Y();
                break;
            case 22:
                od2.a0(obj);
                cmd cmdVar = (cmd) this.Z;
                fka fkaVar8 = (fka) this.Y;
                bkg bkgVar = new bkg(25);
                yld yldVar = (yld) bkgVar.b;
                yldVar.k = false;
                yldVar.i = 0.0f;
                bkgVar.v(fkaVar8.b().l);
                yldVar.d = fkaVar8.b().k;
                bkgVar.u();
                bkgVar.x(tu0.G(86 * fk4.d().getDisplayMetrics().density));
                cmdVar.a(bkgVar.m());
                break;
            case 23:
                od2.a0(obj);
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                od2.a0(obj);
                aba abaVar = (aba) this.Y;
                qp4 qp4VarB = qp4.u0.b((Context) this.Z);
                fka currentTheme = abaVar.getCurrentTheme();
                qp4VarB.getClass();
                qp4.c(abaVar, currentTheme);
                break;
            case 25:
                od2.a0(obj);
                pha phaVar = (pha) this.Z;
                ((fka) this.Y).g().a.b.getClass();
                phaVar.t0 = 687865856;
                break;
            case 26:
                od2.a0(obj);
                ((eb9) this.Z).setBackground(new RippleDrawable(ColorStateList.valueOf(((fka) this.Y).d().a.a.d), null, new ColorDrawable(-65536)));
                break;
            case 27:
                od2.a0(obj);
                ((pea) this.Z).setBackground(new RippleDrawable(ColorStateList.valueOf(((fka) this.Y).d().a.a.d), null, new ColorDrawable(-65536)));
                break;
            case 28:
                od2.a0(obj);
                ((k5f) this.Z).setBackground(new RippleDrawable(ColorStateList.valueOf(((fka) this.Y).d().a.a.d), null, new ColorDrawable(-65536)));
                break;
            default:
                od2.a0(obj);
                ((ShapeDrawable) this.Z).getPaint().setColor(((fka) this.Y).i().b.b);
                break;
        }
        return e5f.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xh0(hqd hqdVar, Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Y = hqdVar;
        this.Z = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xh0(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = obj;
    }
}
