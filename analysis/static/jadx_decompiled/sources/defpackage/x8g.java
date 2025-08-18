package defpackage;

import androidx.work.impl.model.WorkersQueueDao_Impl;

/* loaded from: classes.dex */
public final class x8g extends r25 {
    public final /* synthetic */ WorkersQueueDao_Impl X;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x8g(WorkersQueueDao_Impl workersQueueDao_Impl, ilc ilcVar, int i) {
        super(ilcVar);
        this.o = i;
        this.X = workersQueueDao_Impl;
    }

    @Override // defpackage.r25
    public final void A(q36 q36Var, Object obj) {
        switch (this.o) {
            case 0:
                q8g q8gVar = (q8g) obj;
                String str = q8gVar.a;
                if (str == null) {
                    q36Var.W(1);
                } else {
                    q36Var.f(1, str);
                }
                String str2 = q8gVar.b;
                if (str2 == null) {
                    q36Var.W(2);
                } else {
                    q36Var.f(2, str2);
                }
                q36Var.f(3, this.X.__ExistingWorkPolicy_enumToString(q8gVar.c));
                q36Var.f(4, x53.n0(q8gVar.e, ",", null, null, null, 62));
                q36Var.j(5, q8gVar.f);
                q36Var.j(6, q8gVar.g);
                h8g h8gVar = q8gVar.d;
                String str3 = h8gVar.a;
                if (str3 == null) {
                    q36Var.W(7);
                } else {
                    q36Var.f(7, str3);
                }
                q36Var.j(8, nu0.O(h8gVar.b));
                String str4 = h8gVar.c;
                if (str4 == null) {
                    q36Var.W(9);
                } else {
                    q36Var.f(9, str4);
                }
                String str5 = h8gVar.d;
                if (str5 == null) {
                    q36Var.W(10);
                } else {
                    q36Var.f(10, str5);
                }
                byte[] bArrF = d24.f(h8gVar.e);
                if (bArrF == null) {
                    q36Var.W(11);
                } else {
                    q36Var.k(11, bArrF);
                }
                byte[] bArrF2 = d24.f(h8gVar.f);
                if (bArrF2 == null) {
                    q36Var.W(12);
                } else {
                    q36Var.k(12, bArrF2);
                }
                q36Var.j(13, h8gVar.g);
                q36Var.j(14, h8gVar.h);
                q36Var.j(15, h8gVar.i);
                q36Var.j(16, h8gVar.k);
                q36Var.j(17, nu0.b(h8gVar.l));
                q36Var.j(18, h8gVar.m);
                q36Var.j(19, h8gVar.n);
                q36Var.j(20, h8gVar.o);
                q36Var.j(21, h8gVar.p);
                q36Var.j(22, h8gVar.q ? 1L : 0L);
                q36Var.j(23, nu0.D(h8gVar.r));
                q36Var.j(24, h8gVar.s);
                q36Var.j(25, h8gVar.t);
                kj3 kj3Var = h8gVar.j;
                q36Var.j(26, nu0.B(kj3Var.a));
                q36Var.j(27, kj3Var.b ? 1L : 0L);
                q36Var.j(28, kj3Var.c ? 1L : 0L);
                q36Var.j(29, kj3Var.d ? 1L : 0L);
                q36Var.j(30, kj3Var.e ? 1L : 0L);
                q36Var.j(31, kj3Var.f);
                q36Var.j(32, kj3Var.g);
                q36Var.k(33, nu0.M(kj3Var.h));
                break;
            default:
                q8g q8gVar2 = (q8g) obj;
                String str6 = q8gVar2.a;
                if (str6 == null) {
                    q36Var.W(1);
                } else {
                    q36Var.f(1, str6);
                }
                String str7 = q8gVar2.b;
                if (str7 == null) {
                    q36Var.W(2);
                } else {
                    q36Var.f(2, str7);
                }
                q36Var.f(3, this.X.__ExistingWorkPolicy_enumToString(q8gVar2.c));
                q36Var.f(4, x53.n0(q8gVar2.e, ",", null, null, null, 62));
                q36Var.j(5, q8gVar2.f);
                q36Var.j(6, q8gVar2.g);
                h8g h8gVar2 = q8gVar2.d;
                String str8 = h8gVar2.a;
                if (str8 == null) {
                    q36Var.W(7);
                } else {
                    q36Var.f(7, str8);
                }
                q36Var.j(8, nu0.O(h8gVar2.b));
                String str9 = h8gVar2.c;
                if (str9 == null) {
                    q36Var.W(9);
                } else {
                    q36Var.f(9, str9);
                }
                String str10 = h8gVar2.d;
                if (str10 == null) {
                    q36Var.W(10);
                } else {
                    q36Var.f(10, str10);
                }
                byte[] bArrF3 = d24.f(h8gVar2.e);
                if (bArrF3 == null) {
                    q36Var.W(11);
                } else {
                    q36Var.k(11, bArrF3);
                }
                byte[] bArrF4 = d24.f(h8gVar2.f);
                if (bArrF4 == null) {
                    q36Var.W(12);
                } else {
                    q36Var.k(12, bArrF4);
                }
                q36Var.j(13, h8gVar2.g);
                q36Var.j(14, h8gVar2.h);
                q36Var.j(15, h8gVar2.i);
                q36Var.j(16, h8gVar2.k);
                q36Var.j(17, nu0.b(h8gVar2.l));
                q36Var.j(18, h8gVar2.m);
                q36Var.j(19, h8gVar2.n);
                q36Var.j(20, h8gVar2.o);
                q36Var.j(21, h8gVar2.p);
                q36Var.j(22, h8gVar2.q ? 1L : 0L);
                q36Var.j(23, nu0.D(h8gVar2.r));
                q36Var.j(24, h8gVar2.s);
                q36Var.j(25, h8gVar2.t);
                kj3 kj3Var2 = h8gVar2.j;
                q36Var.j(26, nu0.B(kj3Var2.a));
                q36Var.j(27, kj3Var2.b ? 1L : 0L);
                q36Var.j(28, kj3Var2.c ? 1L : 0L);
                q36Var.j(29, kj3Var2.d ? 1L : 0L);
                q36Var.j(30, kj3Var2.e ? 1L : 0L);
                q36Var.j(31, kj3Var2.f);
                q36Var.j(32, kj3Var2.g);
                q36Var.k(33, nu0.M(kj3Var2.h));
                break;
        }
    }

    @Override // defpackage.v2
    public final String g() {
        switch (this.o) {
            case 0:
                return "INSERT OR IGNORE INTO `WorkerQueueItem` (`uuid`,`uniqueWorkName`,`existingWorkPolicy`,`tags`,`time`,`state`,`work_spec_id`,`work_spec_state`,`work_spec_worker_class_name`,`work_spec_input_merger_class_name`,`work_spec_input`,`work_spec_output`,`work_spec_initial_delay`,`work_spec_interval_duration`,`work_spec_flex_duration`,`work_spec_run_attempt_count`,`work_spec_backoff_policy`,`work_spec_backoff_delay_duration`,`work_spec_last_enqueue_time`,`work_spec_minimum_retention_duration`,`work_spec_schedule_requested_at`,`work_spec_run_in_foreground`,`work_spec_out_of_quota_policy`,`work_spec_period_count`,`work_spec_generation`,`work_spec_required_network_type`,`work_spec_requires_charging`,`work_spec_requires_device_idle`,`work_spec_requires_battery_not_low`,`work_spec_requires_storage_not_low`,`work_spec_trigger_content_update_delay`,`work_spec_trigger_max_content_delay`,`work_spec_content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `WorkerQueueItem` (`uuid`,`uniqueWorkName`,`existingWorkPolicy`,`tags`,`time`,`state`,`work_spec_id`,`work_spec_state`,`work_spec_worker_class_name`,`work_spec_input_merger_class_name`,`work_spec_input`,`work_spec_output`,`work_spec_initial_delay`,`work_spec_interval_duration`,`work_spec_flex_duration`,`work_spec_run_attempt_count`,`work_spec_backoff_policy`,`work_spec_backoff_delay_duration`,`work_spec_last_enqueue_time`,`work_spec_minimum_retention_duration`,`work_spec_schedule_requested_at`,`work_spec_run_in_foreground`,`work_spec_out_of_quota_policy`,`work_spec_period_count`,`work_spec_generation`,`work_spec_required_network_type`,`work_spec_requires_charging`,`work_spec_requires_device_idle`,`work_spec_requires_battery_not_low`,`work_spec_requires_storage_not_low`,`work_spec_trigger_content_update_delay`,`work_spec_trigger_max_content_delay`,`work_spec_content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }
}
