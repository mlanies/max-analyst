package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class wb3 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();
    public final /* synthetic */ yb3 h;

    public wb3(b bVar) {
        this.h = bVar;
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        g8 g8Var = (g8) this.e.get(str);
        if ((g8Var != null ? g8Var.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                g8Var.a.x(g8Var.b.u(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new d8(intent, i2));
        return true;
    }

    public final void b(int i, f8 f8Var, Object obj) throws IntentSender.SendIntentException {
        Bundle bundle;
        yb3 yb3Var = this.h;
        o9g o9gVarI = f8Var.i(yb3Var, obj);
        if (o9gVarI != null) {
            new Handler(Looper.getMainLooper()).post(new si1(this, i, o9gVarI, 3));
            return;
        }
        Intent intentD = f8Var.d(obj);
        if (intentD.getExtras() != null && intentD.getExtras().getClassLoader() == null) {
            intentD.setExtrasClassLoader(yb3Var.getClassLoader());
        }
        if (intentD.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = intentD.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentD.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentD.getAction())) {
            String[] stringArrayExtra = intentD.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            z7.O(yb3Var, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentD.getAction())) {
            yb3Var.startActivityForResult(intentD, i, bundle);
            return;
        }
        n37 n37Var = (n37) intentD.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            yb3Var.startIntentSenderForResult(n37Var.a, i, n37Var.b, n37Var.c, n37Var.o, 0, bundle);
        } catch (IntentSender.SendIntentException e) {
            new Handler(Looper.getMainLooper()).post(new si1(this, i, e, 4));
        }
    }

    public final pl8 c(String str, f8 f8Var, e8 e8Var) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) == null) {
            Iterator it = new ni3(new km4(h8.b, 1, new c0())).iterator();
            while (it.hasNext()) {
                Number number = (Number) it.next();
                int iIntValue = number.intValue();
                LinkedHashMap linkedHashMap2 = this.a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(iIntValue))) {
                    int iIntValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(iIntValue2), str);
                    linkedHashMap.put(str, Integer.valueOf(iIntValue2));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        this.e.put(str, new g8(e8Var, f8Var));
        LinkedHashMap linkedHashMap3 = this.f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            e8Var.x(obj);
        }
        Bundle bundle = this.g;
        d8 d8Var = (d8) ay7.v(bundle, str, d8.class);
        if (d8Var != null) {
            bundle.remove(str);
            e8Var.x(f8Var.u(d8Var.b, d8Var.a));
        }
        return new pl8(this, str, f8Var, 1);
    }
}
