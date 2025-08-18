package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class uhe implements e7g, w45 {
    public static final String u0 = a14.O("SystemFgDispatcher");
    public final LinkedHashMap X;
    public final HashMap Y;
    public final HashSet Z;
    public final s7g a;
    public final wne b;
    public final Object c = new Object();
    public l7g o;
    public final adb s0;
    public the t0;

    public uhe(Context context) {
        s7g s7gVarD = s7g.d(context);
        this.a = s7gVarD;
        this.b = s7gVarD.d;
        this.o = null;
        this.X = new LinkedHashMap();
        this.Z = new HashSet();
        this.Y = new HashMap();
        this.s0 = new adb(s7gVarD.j, this);
        s7gVarD.f.a(this);
    }

    public static Intent c(Context context, l7g l7gVar, ay5 ay5Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", ay5Var.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", ay5Var.b);
        intent.putExtra("KEY_NOTIFICATION", ay5Var.c);
        intent.putExtra("KEY_WORKSPEC_ID", l7gVar.a);
        intent.putExtra("KEY_GENERATION", l7gVar.b);
        return intent;
    }

    public static Intent d(Context context, l7g l7gVar, ay5 ay5Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", l7gVar.a);
        intent.putExtra("KEY_GENERATION", l7gVar.b);
        intent.putExtra("KEY_NOTIFICATION_ID", ay5Var.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", ay5Var.b);
        intent.putExtra("KEY_NOTIFICATION", ay5Var.c);
        return intent;
    }

    @Override // defpackage.e7g
    public final void a(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h8g h8gVar = (h8g) it.next();
            String str = h8gVar.a;
            a14.u().n(u0, wg0.i("Constraints unmet for WorkSpec ", str));
            l7g l7gVarN = ju0.n(h8gVar);
            s7g s7gVar = this.a;
            s7gVar.d.l(new k8e(s7gVar, new yzd(l7gVarN), true));
        }
    }

    @Override // defpackage.w45
    public final void b(l7g l7gVar, boolean z) {
        Map.Entry entry;
        synchronized (this.c) {
            try {
                h8g h8gVar = (h8g) this.Y.remove(l7gVar);
                if (h8gVar != null ? this.Z.remove(h8gVar) : false) {
                    this.s0.w(this.Z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ay5 ay5Var = (ay5) this.X.remove(l7gVar);
        if (l7gVar.equals(this.o) && this.X.size() > 0) {
            Iterator it = this.X.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.o = (l7g) entry.getKey();
            if (this.t0 != null) {
                ay5 ay5Var2 = (ay5) entry.getValue();
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.t0;
                systemForegroundService.b.post(new vhe(systemForegroundService, ay5Var2.a, ay5Var2.c, ay5Var2.b));
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.t0;
                systemForegroundService2.b.post(new zj0(ay5Var2.a, 3, systemForegroundService2));
            }
        }
        the theVar = this.t0;
        if (ay5Var == null || theVar == null) {
            return;
        }
        a14.u().n(u0, "Removing Notification (id: " + ay5Var.a + ", workSpecId: " + l7gVar + ", notificationType: " + ay5Var.b);
        SystemForegroundService systemForegroundService3 = (SystemForegroundService) theVar;
        systemForegroundService3.b.post(new zj0(ay5Var.a, 3, systemForegroundService3));
    }

    public final void e(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        l7g l7gVar = new l7g(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        a14 a14VarU = a14.u();
        StringBuilder sb = new StringBuilder("Notifying with (id:");
        sb.append(intExtra);
        sb.append(", workSpecId: ");
        sb.append(stringExtra);
        sb.append(", notificationType :");
        a14VarU.n(u0, zr6.j(sb, intExtra2, ")"));
        if (notification == null || this.t0 == null) {
            return;
        }
        ay5 ay5Var = new ay5(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.X;
        linkedHashMap.put(l7gVar, ay5Var);
        if (this.o == null) {
            this.o = l7gVar;
            SystemForegroundService systemForegroundService = (SystemForegroundService) this.t0;
            systemForegroundService.b.post(new vhe(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.t0;
        systemForegroundService2.b.post(new eo(systemForegroundService2, intExtra, notification, 5));
        if (intExtra2 != 0) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                i |= ((ay5) ((Map.Entry) it.next()).getValue()).b;
            }
            ay5 ay5Var2 = (ay5) linkedHashMap.get(this.o);
            if (ay5Var2 != null) {
                SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.t0;
                systemForegroundService3.b.post(new vhe(systemForegroundService3, ay5Var2.a, ay5Var2.c, i));
            }
        }
    }

    @Override // defpackage.e7g
    public final void f(List list) {
    }

    public final void g() {
        this.t0 = null;
        synchronized (this.c) {
            this.s0.x();
        }
        this.a.f.e(this);
    }
}
