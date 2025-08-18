package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.permissionhost.PermissionBottomSheet;

/* loaded from: classes.dex */
public final class hq implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hq(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bool = null;
        Boolean bool = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                ((m56) obj2).invoke(((eq) obj).a);
                return;
            case 1:
                CallWaitingRoomEventsWidget callWaitingRoomEventsWidget = (CallWaitingRoomEventsWidget) obj2;
                callWaitingRoomEventsWidget.o0(((rp1) ((up1) obj)).d);
                je1.c.P1().b(":call-opponents-list?arg_key_scope_id=".concat(callWaitingRoomEventsWidget.getA()), null);
                return;
            case 2:
                eg8 eg8Var = (eg8) obj;
                dh8 dh8Var = (dh8) obj2;
                eg8Var.J0.u0.y0 = dh8Var;
                dh8Var.l();
                eg8Var.G0.setVisibility(4);
                eg8Var.H0.setVisibility(0);
                return;
            case 3:
                PermissionBottomSheet permissionBottomSheet = (PermissionBottomSheet) obj;
                try {
                    permissionBottomSheet.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", ((LinearLayout) obj2).getContext().getPackageName(), null)));
                } catch (Throwable unused) {
                }
                permissionBottomSheet.s0(true);
                return;
            case 4:
                ((PermissionBottomSheet) obj2).G0 = true;
                PermissionBottomSheet permissionBottomSheet2 = (PermissionBottomSheet) obj;
                eua euaVar = (eua) permissionBottomSheet2.y0.getValue();
                uu3 targetController = permissionBottomSheet2.getTargetController();
                Widget widget = targetController instanceof Widget ? (Widget) targetController : null;
                if (widget == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                l5g l5gVar = new l5g(widget, 1);
                bc7[] bc7VarArr = PermissionBottomSheet.H0;
                bc7 bc7Var = bc7VarArr[4];
                String[] strArr = (String[]) permissionBottomSheet2.D0.a(permissionBottomSheet2);
                if (strArr == null) {
                    strArr = new String[0];
                }
                bc7 bc7Var2 = bc7VarArr[5];
                euaVar.f(l5gVar, strArr, ((Number) permissionBottomSheet2.E0.a(permissionBottomSheet2)).intValue());
                permissionBottomSheet2.s0(true);
                return;
            case 5:
                bc7[] bc7VarArr2 = RecordExitBottomSheet.G0;
                RecordExitBottomSheet recordExitBottomSheet = (RecordExitBottomSheet) obj2;
                kcc kccVar = (kcc) recordExitBottomSheet.z0.getValue();
                int i = (int) ((icc) obj).c.a;
                boolean zIsChecked = recordExitBottomSheet.A0().isChecked();
                kccVar.getClass();
                if (i != y7a.t1 && i != y7a.k1) {
                    int i2 = y7a.s1;
                    ir1 ir1Var = kccVar.o;
                    if (i == i2) {
                        ((wr1) ir1Var.a).v();
                    } else if (i == y7a.l1) {
                        Boolean boolValueOf = Boolean.valueOf(zIsChecked);
                        icc iccVar = (icc) kccVar.s0.a.getValue();
                        if (iccVar != null && iccVar.f) {
                            bool = boolValueOf;
                        }
                        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                        Boolean bool2 = kccVar.c;
                        if (bool2 != null) {
                            ((yz0) ((ez0) kccVar.Z.getValue())).i(bool2.booleanValue());
                        }
                        ir1Var.k(zBooleanValue);
                    }
                }
                recordExitBottomSheet.s0(true);
                return;
            case 6:
                rwe rweVar = (rwe) obj;
                Window.Callback callback = rweVar.k;
                if (callback == null || !rweVar.l) {
                    return;
                }
                callback.onMenuItemSelected(0, (y6) obj2);
                return;
            default:
                try {
                    ((Context) obj2).startActivity((Intent) obj);
                    return;
                } catch (ActivityNotFoundException unused2) {
                    return;
                }
        }
    }

    public hq(rwe rweVar) {
        this.a = 6;
        this.c = rweVar;
        this.b = new y6(rweVar.a.getContext(), rweVar.h);
    }

    public hq(eg8 eg8Var, dh8 dh8Var) {
        this.a = 2;
        this.c = eg8Var;
        this.b = dh8Var;
    }
}
