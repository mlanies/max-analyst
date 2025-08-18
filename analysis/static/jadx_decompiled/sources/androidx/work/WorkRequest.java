package androidx.work;

import android.annotation.SuppressLint;
import defpackage.d24;
import defpackage.d8g;
import defpackage.gm7;
import defpackage.gt4;
import defpackage.h8g;
import defpackage.jna;
import defpackage.kj3;
import defpackage.m7g;
import defpackage.mf0;
import defpackage.mz7;
import defpackage.ys;
import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0013\b&\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0019B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Landroidx/work/WorkRequest;", "", "Ljava/util/UUID;", "id", "Lh8g;", "workSpec", "", "", "tags", "<init>", "(Ljava/util/UUID;Lh8g;Ljava/util/Set;)V", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "Lh8g;", "getWorkSpec", "()Lh8g;", "Ljava/util/Set;", "getTags", "()Ljava/util/Set;", "getStringId", "()Ljava/lang/String;", "stringId", "Companion", "Builder", "d8g", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class WorkRequest {
    public static final d8g Companion = new d8g();
    public static final long DEFAULT_BACKOFF_DELAY_MILLIS = 30000;

    @SuppressLint({"MinMaxConstant"})
    public static final long MAX_BACKOFF_MILLIS = 18000000;

    @SuppressLint({"MinMaxConstant"})
    public static final long MIN_BACKOFF_MILLIS = 10000;
    private final UUID id;
    private final Set<String> tags;
    private final h8g workSpec;

    public WorkRequest(UUID uuid, h8g h8gVar, Set<String> set) {
        this.id = uuid;
        this.workSpec = h8gVar;
        this.tags = set;
    }

    public UUID getId() {
        return this.id;
    }

    public final String getStringId() {
        return getId().toString();
    }

    public final Set<String> getTags() {
        return this.tags;
    }

    public final h8g getWorkSpec() {
        return this.workSpec;
    }

    @Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\b\b&\u0018\u0000*\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u0019\b\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0014\u0010\u0018J\u0015\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001d\u0010%\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b%\u0010&J\u0017\u0010%\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b%\u0010'J\u001f\u0010(\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010&J\u0017\u0010(\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b(\u0010'J\u0017\u0010+\u001a\u00028\u00002\u0006\u0010*\u001a\u00020)H\u0017¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00028\u0001¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00028\u0001H ¢\u0006\u0004\b/\u0010.J\u0017\u00103\u001a\u00028\u00002\u0006\u00102\u001a\u000201H\u0007¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00028\u00002\u0006\u00106\u001a\u000205H\u0007¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u00028\u00002\u0006\u00109\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b:\u0010&J\u001f\u0010<\u001a\u00028\u00002\u0006\u0010;\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b<\u0010&R\"\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010?R\"\u0010A\u001a\u00020@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010M\u001a\u00020L8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR \u0010T\u001a\b\u0012\u0004\u0012\u00020!0S8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0014\u0010Z\u001a\u00028\u00008 X \u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006["}, d2 = {"Landroidx/work/WorkRequest$Builder;", "B", "Landroidx/work/WorkRequest;", "W", "", "Ljava/lang/Class;", "Lgm7;", "workerClass", "<init>", "(Ljava/lang/Class;)V", "Ljava/util/UUID;", "id", "setId", "(Ljava/util/UUID;)Landroidx/work/WorkRequest$Builder;", "Lmf0;", "backoffPolicy", "", "backoffDelay", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "setBackoffCriteria", "(Lmf0;JLjava/util/concurrent/TimeUnit;)Landroidx/work/WorkRequest$Builder;", "Ljava/time/Duration;", "duration", "(Lmf0;Ljava/time/Duration;)Landroidx/work/WorkRequest$Builder;", "Lkj3;", "constraints", "setConstraints", "(Lkj3;)Landroidx/work/WorkRequest$Builder;", "Ld24;", "inputData", "setInputData", "(Ld24;)Landroidx/work/WorkRequest$Builder;", "", "tag", "addTag", "(Ljava/lang/String;)Landroidx/work/WorkRequest$Builder;", "keepResultsForAtLeast", "(JLjava/util/concurrent/TimeUnit;)Landroidx/work/WorkRequest$Builder;", "(Ljava/time/Duration;)Landroidx/work/WorkRequest$Builder;", "setInitialDelay", "Ljna;", "policy", "setExpedited", "(Ljna;)Landroidx/work/WorkRequest$Builder;", "build", "()Landroidx/work/WorkRequest;", "buildInternal$work_runtime_release", "buildInternal", "Lm7g;", "state", "setInitialState", "(Lm7g;)Landroidx/work/WorkRequest$Builder;", "", "runAttemptCount", "setInitialRunAttemptCount", "(I)Landroidx/work/WorkRequest$Builder;", "periodStartTime", "setLastEnqueueTime", "scheduleRequestedAt", "setScheduleRequestedAt", "Ljava/lang/Class;", "getWorkerClass$work_runtime_release", "()Ljava/lang/Class;", "", "backoffCriteriaSet", "Z", "getBackoffCriteriaSet$work_runtime_release", "()Z", "setBackoffCriteriaSet$work_runtime_release", "(Z)V", "Ljava/util/UUID;", "getId$work_runtime_release", "()Ljava/util/UUID;", "setId$work_runtime_release", "(Ljava/util/UUID;)V", "Lh8g;", "workSpec", "Lh8g;", "getWorkSpec$work_runtime_release", "()Lh8g;", "setWorkSpec$work_runtime_release", "(Lh8g;)V", "", "tags", "Ljava/util/Set;", "getTags$work_runtime_release", "()Ljava/util/Set;", "getThisObject$work_runtime_release", "()Landroidx/work/WorkRequest$Builder;", "thisObject", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class Builder<B extends Builder<B, ?>, W extends WorkRequest> {
        private boolean backoffCriteriaSet;
        private UUID id = UUID.randomUUID();
        private final Set<String> tags;
        private h8g workSpec;
        private final Class<? extends gm7> workerClass;

        public Builder(Class<? extends gm7> cls) {
            this.workerClass = cls;
            this.workSpec = new h8g(this.id.toString(), null, cls.getName(), null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 1048570, 0);
            String[] strArr = {cls.getName()};
            LinkedHashSet linkedHashSet = new LinkedHashSet(mz7.Z(1));
            ys.k0(strArr, linkedHashSet);
            this.tags = linkedHashSet;
        }

        public final B addTag(String tag) {
            this.tags.add(tag);
            return (B) getThisObject$work_runtime_release();
        }

        public final W build() {
            W w = (W) buildInternal$work_runtime_release();
            kj3 kj3Var = this.workSpec.j;
            boolean z = (kj3Var.h.isEmpty() ^ true) || kj3Var.d || kj3Var.b || kj3Var.c;
            h8g h8gVar = this.workSpec;
            if (h8gVar.q) {
                if (!(!z)) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                }
                if (h8gVar.g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                }
            }
            setId(UUID.randomUUID());
            return w;
        }

        public abstract W buildInternal$work_runtime_release();

        /* renamed from: getBackoffCriteriaSet$work_runtime_release, reason: from getter */
        public final boolean getBackoffCriteriaSet() {
            return this.backoffCriteriaSet;
        }

        /* renamed from: getId$work_runtime_release, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        public final Set<String> getTags$work_runtime_release() {
            return this.tags;
        }

        public abstract B getThisObject$work_runtime_release();

        /* renamed from: getWorkSpec$work_runtime_release, reason: from getter */
        public final h8g getWorkSpec() {
            return this.workSpec;
        }

        public final Class<? extends gm7> getWorkerClass$work_runtime_release() {
            return this.workerClass;
        }

        public final B keepResultsForAtLeast(long duration, TimeUnit timeUnit) {
            this.workSpec.o = timeUnit.toMillis(duration);
            return (B) getThisObject$work_runtime_release();
        }

        public final B setBackoffCriteria(mf0 backoffPolicy, long backoffDelay, TimeUnit timeUnit) {
            this.backoffCriteriaSet = true;
            h8g h8gVar = this.workSpec;
            h8gVar.l = backoffPolicy;
            h8gVar.e(timeUnit.toMillis(backoffDelay));
            return (B) getThisObject$work_runtime_release();
        }

        public final void setBackoffCriteriaSet$work_runtime_release(boolean z) {
            this.backoffCriteriaSet = z;
        }

        public final B setConstraints(kj3 constraints) {
            this.workSpec.j = constraints;
            return (B) getThisObject$work_runtime_release();
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        public B setExpedited(jna policy) {
            h8g h8gVar = this.workSpec;
            h8gVar.q = true;
            h8gVar.r = policy;
            return (B) getThisObject$work_runtime_release();
        }

        public final B setId(UUID id) {
            this.id = id;
            String string = id.toString();
            h8g h8gVar = this.workSpec;
            String str = h8gVar.c;
            m7g m7gVar = h8gVar.b;
            String str2 = h8gVar.d;
            d24 d24Var = new d24(h8gVar.e);
            d24 d24Var2 = new d24(h8gVar.f);
            long j = h8gVar.g;
            long j2 = h8gVar.h;
            long j3 = h8gVar.i;
            kj3 kj3Var = h8gVar.j;
            this.workSpec = new h8g(string, m7gVar, str, str2, d24Var, d24Var2, j, j2, j3, new kj3(kj3Var.a, kj3Var.b, kj3Var.c, kj3Var.d, kj3Var.e, kj3Var.f, kj3Var.g, kj3Var.h), h8gVar.k, h8gVar.l, h8gVar.m, h8gVar.n, h8gVar.o, h8gVar.p, h8gVar.q, h8gVar.r, h8gVar.s, 524288, 0);
            return (B) getThisObject$work_runtime_release();
        }

        public final void setId$work_runtime_release(UUID uuid) {
            this.id = uuid;
        }

        public B setInitialDelay(long duration, TimeUnit timeUnit) {
            this.workSpec.g = timeUnit.toMillis(duration);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.workSpec.g) {
                return (B) getThisObject$work_runtime_release();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
        }

        public final B setInitialRunAttemptCount(int runAttemptCount) {
            this.workSpec.k = runAttemptCount;
            return (B) getThisObject$work_runtime_release();
        }

        public final B setInitialState(m7g state) {
            this.workSpec.b = state;
            return (B) getThisObject$work_runtime_release();
        }

        public final B setInputData(d24 inputData) {
            this.workSpec.e = inputData;
            return (B) getThisObject$work_runtime_release();
        }

        public final B setLastEnqueueTime(long periodStartTime, TimeUnit timeUnit) {
            this.workSpec.n = timeUnit.toMillis(periodStartTime);
            return (B) getThisObject$work_runtime_release();
        }

        public final B setScheduleRequestedAt(long scheduleRequestedAt, TimeUnit timeUnit) {
            this.workSpec.p = timeUnit.toMillis(scheduleRequestedAt);
            return (B) getThisObject$work_runtime_release();
        }

        public final void setWorkSpec$work_runtime_release(h8g h8gVar) {
            this.workSpec = h8gVar;
        }

        public final B keepResultsForAtLeast(Duration duration) {
            this.workSpec.o = gt4.a(duration);
            return (B) getThisObject$work_runtime_release();
        }

        public final B setBackoffCriteria(mf0 backoffPolicy, Duration duration) {
            this.backoffCriteriaSet = true;
            h8g h8gVar = this.workSpec;
            h8gVar.l = backoffPolicy;
            h8gVar.e(gt4.a(duration));
            return (B) getThisObject$work_runtime_release();
        }

        public B setInitialDelay(Duration duration) {
            this.workSpec.g = gt4.a(duration);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.workSpec.g) {
                return (B) getThisObject$work_runtime_release();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
        }
    }
}
