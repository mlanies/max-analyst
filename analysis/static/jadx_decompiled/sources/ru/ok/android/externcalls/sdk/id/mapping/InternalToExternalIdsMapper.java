package ru.ok.android.externcalls.sdk.id.mapping;

import android.net.Uri;
import android.os.Looper;
import defpackage.a4c;
import defpackage.ag1;
import defpackage.bg1;
import defpackage.bl0;
import defpackage.cl0;
import defpackage.il;
import defpackage.jb9;
import defpackage.kl;
import defpackage.m56;
import defpackage.n9e;
import defpackage.oz4;
import defpackage.q2a;
import defpackage.rd7;
import defpackage.rk0;
import defpackage.sk0;
import defpackage.tu0;
import defpackage.x53;
import defpackage.z53;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.ExternalIdsResponse;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\b\u0000\u0018\u0000 &2\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0001:\u0001&B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u00110\u00102\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u00112\u0010\u0010\u0016\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00122\u001a\u0010\u001b\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ5\u0010!\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050 2\u0010\u0010\u001f\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u000eH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%¨\u0006'"}, d2 = {"Lru/ok/android/externcalls/sdk/id/mapping/InternalToExternalIdsMapper;", "Lru/ok/android/externcalls/sdk/id/mapping/IdsMapper;", "Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "Lq2a;", "okApi", "Lag1;", "callParams", "La4c;", "logger", "<init>", "(Lq2a;Lag1;La4c;)V", "", "resolutionCandidates", "", "Lsk0;", "Lru/ok/android/externcalls/sdk/api/ExternalIdsResponse;", "kotlin.jvm.PlatformType", "getBatchedExternalsRequest", "(Ljava/util/Collection;)Ljava/util/List;", "candidates", "getResolveExternalRequestForCandidates", "(Ljava/util/List;)Lsk0;", "response", "", "idsMap", "Le5f;", "applyExternals", "(Lru/ok/android/externcalls/sdk/api/ExternalIdsResponse;Ljava/util/Map;)V", "from", "", "map", "(Ljava/util/Collection;)Ljava/util/Map;", "Lq2a;", "Lag1;", "La4c;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class InternalToExternalIdsMapper implements IdsMapper<bg1, ParticipantId> {
    private static final int MAX_RESOLUTION_CANDIDATES_PER_REQUEST = 200;
    private final ag1 callParams;
    private final a4c logger;
    private final q2a okApi;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "it", "", "invoke", "(Lbg1;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.id.mapping.InternalToExternalIdsMapper$getResolveExternalRequestForCandidates$1, reason: invalid class name */
    public static final class AnonymousClass1 extends rd7 implements m56 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.m56
        public final CharSequence invoke(bg1 bg1Var) {
            return String.valueOf(bg1Var.a);
        }
    }

    public InternalToExternalIdsMapper(q2a q2aVar, ag1 ag1Var, a4c a4cVar) {
        this.okApi = q2aVar;
        this.callParams = ag1Var;
        this.logger = a4cVar;
    }

    private final void applyExternals(ExternalIdsResponse response, Map<bg1, ParticipantId> idsMap) {
        if (response == null) {
            return;
        }
        Map<bg1, ParticipantId> mapping = response.getMapping();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<bg1, ParticipantId> entry : mapping.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        idsMap.putAll(linkedHashMap);
    }

    private final List<sk0> getBatchedExternalsRequest(Collection<bg1> resolutionCandidates) {
        ArrayList arrayListI0 = x53.I0(resolutionCandidates, 200, 200);
        ArrayList arrayList = new ArrayList(z53.S(arrayListI0, 10));
        Iterator it = arrayListI0.iterator();
        while (it.hasNext()) {
            arrayList.add(getResolveExternalRequestForCandidates((List) it.next()));
        }
        return arrayList;
    }

    private final sk0 getResolveExternalRequestForCandidates(List<bg1> candidates) {
        rk0 rk0VarS = tu0.s("vchat.getExternalIdsByOkIds");
        rk0VarS.b = kl.c;
        rk0VarS.c.a(new n9e(ApiProtocol.PARAM_UIDS, x53.n0(candidates, ",", null, null, AnonymousClass1.INSTANCE, 30)));
        return rk0VarS.a(ExternalIdsResponse.INSTANCE);
    }

    @Override // ru.ok.android.externcalls.sdk.id.mapping.IdsMapper
    public Map<bg1, ParticipantId> map(Collection<? extends bg1> from) {
        boolean z = jb9.a;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Background thread expected");
        }
        if (from.isEmpty()) {
            return oz4.a;
        }
        List<sk0> batchedExternalsRequest = getBatchedExternalsRequest(from);
        Uri uri = bl0.X;
        ArrayList arrayList = new ArrayList();
        for (sk0 sk0Var : batchedExternalsRequest) {
            arrayList.add(new il(sk0Var, sk0Var));
        }
        cl0 cl0Var = (cl0) RetryKt.retryApiCallForFastWorkRequired(this.okApi.c().a(new bl0(null, (il[]) arrayList.toArray(new il[0]), 0)), this.callParams.B.h, this.logger).e();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<sk0> it = batchedExternalsRequest.iterator();
        while (it.hasNext()) {
            applyExternals((ExternalIdsResponse) cl0Var.a(it.next()), linkedHashMap);
        }
        return linkedHashMap;
    }
}
