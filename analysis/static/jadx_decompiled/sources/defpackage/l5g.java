package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.permissionhost.PermissionBottomSheet;

/* loaded from: classes.dex */
public final class l5g {
    public final /* synthetic */ int a;
    public final Widget b;
    public final je7 c;

    public l5g(Widget widget, int i) {
        this.a = i;
        switch (i) {
            case 1:
                khe kheVarD = sta.a.getAccessor().d(acf.class);
                this.b = widget;
                this.c = kheVarD;
                break;
            default:
                this.b = widget;
                this.c = tu0.r(3, new rzd(18, this));
                break;
        }
    }

    private final void d(String[] strArr, int i, int i2, int i3, int i4) {
    }

    public void a() {
        wha whaVar = new wha(this.b);
        whaVar.g(new eqe(v7a.a));
        whaVar.i();
    }

    public void b() {
        sc scVar = new sc(this.b.getContext(), R.style.Theme.DeviceDefault.Dialog.NoActionBar);
        int i = v7a.g;
        oc ocVar = scVar.a;
        ocVar.f = ocVar.a.getText(i);
        scVar.setPositiveButton(v7a.h, new e10(3));
        scVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(String[] strArr, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                break;
            default:
                bc7[] bc7VarArr = BottomSheetWidget.x0;
                PermissionBottomSheet permissionBottomSheet = new PermissionBottomSheet(strArr, i, i2, i3, i4);
                Widget widget = this.b;
                permissionBottomSheet.setTargetController(widget);
                uu3 parentController = widget;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                foc focVar = parentController instanceof foc ? (foc) parentController : null;
                znc zncVarT = focVar != null ? focVar.T() : null;
                permissionBottomSheet.z0(widget);
                if (zncVarT != null) {
                    coc cocVar = new coc(permissionBottomSheet, null, null, null, false, -1);
                    wg0.l(false, cocVar, true, "BottomSheetWidget");
                    zncVarT.G(cocVar);
                    break;
                }
                break;
        }
    }

    public final void e(int i, String[] strArr) {
        Object njcVar;
        je7 je7Var = this.c;
        switch (this.a) {
            case 0:
                ((l5g) je7Var.getValue()).e(i, strArr);
                break;
            default:
                Widget widget = this.b;
                if (i != 180) {
                    widget.requestPermissions(strArr, i);
                    break;
                } else {
                    acf acfVar = (acf) je7Var.getValue();
                    Context context = widget.getContext();
                    acfVar.getClass();
                    String str = o37.a;
                    try {
                        context.startActivity(o37.b(context, acfVar.a));
                        njcVar = e5f.a;
                    } catch (Throwable th) {
                        njcVar = new njc(th);
                    }
                    Throwable thA = pjc.a(njcVar);
                    if (thA != null) {
                        hm9.p(o37.a, "showFsiSettings getOpenFsiSettingsIntent error " + thA, null);
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + context.getPackageName()));
                        context.startActivity(intent);
                        break;
                    }
                }
                break;
        }
    }

    public final boolean f(String str) {
        switch (this.a) {
            case 0:
                return ((l5g) this.c.getValue()).f(str);
            default:
                String[] strArr = eua.d;
                if (ys.T(eua.o, str)) {
                    return true;
                }
                return this.b.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(int i, int i2) {
        switch (this.a) {
            case 0:
                ((l5g) this.c.getValue()).g(i, i2);
                break;
            default:
                bc7[] bc7VarArr = BottomSheetWidget.x0;
                PermissionBottomSheet permissionBottomSheet = new PermissionBottomSheet(i, i2);
                Widget widget = this.b;
                permissionBottomSheet.setTargetController(widget);
                uu3 parentController = widget;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                foc focVar = parentController instanceof foc ? (foc) parentController : null;
                znc zncVarT = focVar != null ? focVar.T() : null;
                permissionBottomSheet.z0(widget);
                if (zncVarT != null) {
                    coc cocVar = new coc(permissionBottomSheet, null, null, null, false, -1);
                    wg0.l(false, cocVar, true, "BottomSheetWidget");
                    zncVarT.G(cocVar);
                    break;
                }
                break;
        }
    }
}
