package defpackage;

/* loaded from: classes.dex */
public final class x7g extends r25 {
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x7g(ilc ilcVar, int i) {
        super(ilcVar);
        this.o = i;
    }

    @Override // defpackage.r25
    public final void A(q36 q36Var, Object obj) {
        switch (this.o) {
            case 0:
                w7g w7gVar = (w7g) obj;
                String str = w7gVar.a;
                if (str == null) {
                    q36Var.W(1);
                } else {
                    q36Var.f(1, str);
                }
                String str2 = w7gVar.b;
                if (str2 != null) {
                    q36Var.f(2, str2);
                    break;
                } else {
                    q36Var.W(2);
                    break;
                }
            case 1:
                z7g z7gVar = (z7g) obj;
                String str3 = z7gVar.a;
                if (str3 == null) {
                    q36Var.W(1);
                } else {
                    q36Var.f(1, str3);
                }
                byte[] bArrF = d24.f(z7gVar.b);
                if (bArrF != null) {
                    q36Var.k(2, bArrF);
                    break;
                } else {
                    q36Var.W(2);
                    break;
                }
            case 2:
                h8g h8gVar = (h8g) obj;
                String str4 = h8gVar.a;
                if (str4 == null) {
                    q36Var.W(1);
                } else {
                    q36Var.f(1, str4);
                }
                q36Var.j(2, nu0.O(h8gVar.b));
                String str5 = h8gVar.c;
                if (str5 == null) {
                    q36Var.W(3);
                } else {
                    q36Var.f(3, str5);
                }
                String str6 = h8gVar.d;
                if (str6 == null) {
                    q36Var.W(4);
                } else {
                    q36Var.f(4, str6);
                }
                byte[] bArrF2 = d24.f(h8gVar.e);
                if (bArrF2 == null) {
                    q36Var.W(5);
                } else {
                    q36Var.k(5, bArrF2);
                }
                byte[] bArrF3 = d24.f(h8gVar.f);
                if (bArrF3 == null) {
                    q36Var.W(6);
                } else {
                    q36Var.k(6, bArrF3);
                }
                q36Var.j(7, h8gVar.g);
                q36Var.j(8, h8gVar.h);
                q36Var.j(9, h8gVar.i);
                q36Var.j(10, h8gVar.k);
                q36Var.j(11, nu0.b(h8gVar.l));
                q36Var.j(12, h8gVar.m);
                q36Var.j(13, h8gVar.n);
                q36Var.j(14, h8gVar.o);
                q36Var.j(15, h8gVar.p);
                q36Var.j(16, h8gVar.q ? 1L : 0L);
                q36Var.j(17, nu0.D(h8gVar.r));
                q36Var.j(18, h8gVar.s);
                q36Var.j(19, h8gVar.t);
                kj3 kj3Var = h8gVar.j;
                if (kj3Var == null) {
                    q36Var.W(20);
                    q36Var.W(21);
                    q36Var.W(22);
                    q36Var.W(23);
                    q36Var.W(24);
                    q36Var.W(25);
                    q36Var.W(26);
                    q36Var.W(27);
                    break;
                } else {
                    q36Var.j(20, nu0.B(kj3Var.a));
                    q36Var.j(21, kj3Var.b ? 1L : 0L);
                    q36Var.j(22, kj3Var.c ? 1L : 0L);
                    q36Var.j(23, kj3Var.d ? 1L : 0L);
                    q36Var.j(24, kj3Var.e ? 1L : 0L);
                    q36Var.j(25, kj3Var.f);
                    q36Var.j(26, kj3Var.g);
                    q36Var.k(27, nu0.M(kj3Var.h));
                    break;
                }
            default:
                j8g j8gVar = (j8g) obj;
                String str7 = j8gVar.a;
                if (str7 == null) {
                    q36Var.W(1);
                } else {
                    q36Var.f(1, str7);
                }
                String str8 = j8gVar.b;
                if (str8 != null) {
                    q36Var.f(2, str8);
                    break;
                } else {
                    q36Var.W(2);
                    break;
                }
        }
    }

    @Override // defpackage.v2
    public final String g() {
        switch (this.o) {
            case 0:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 2:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }
}
