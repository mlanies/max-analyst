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
import defpackage.n9e;
import defpackage.oz4;
import defpackage.q2a;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.BatchInternalIdResponse;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\b\u0000\u0018\u0000 )2\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0001:\u0001)B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u00102\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u0017\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00140\u00102\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0012J/\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00142\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J5\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u001a\u0010\u001c\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020 2\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0010H\u0002¢\u0006\u0004\b!\u0010\"J5\u0010$\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050#2\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u000eH\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010(¨\u0006*"}, d2 = {"Lru/ok/android/externcalls/sdk/id/mapping/ExternalToInternalIdsMapper;", "Lru/ok/android/externcalls/sdk/id/mapping/IdsMapper;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "Lq2a;", "okApi", "Lag1;", "callParams", "La4c;", "rtcLog", "<init>", "(Lq2a;Lag1;La4c;)V", "", "from", "", "filterEmptyParticipantIds", "(Ljava/util/Collection;)Ljava/util/List;", "candidates", "Lsk0;", "Lru/ok/android/externcalls/sdk/api/BatchInternalIdResponse;", "kotlin.jvm.PlatformType", "getBatchedResolveInternalIdsRequests", "getResolveInternalIdsRequestsForCandidates", "(Ljava/util/List;)Lsk0;", "response", "", "ids", "Le5f;", "applyInternalIds", "(Lru/ok/android/externcalls/sdk/api/BatchInternalIdResponse;Ljava/util/Map;)V", "", "constructRequestIdsParameter", "(Ljava/util/List;)Ljava/lang/String;", "", "map", "(Ljava/util/Collection;)Ljava/util/Map;", "Lq2a;", "Lag1;", "La4c;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ExternalToInternalIdsMapper implements IdsMapper<ParticipantId, bg1> {
    private static final String LOG_TAG = "ExternalToInternalIdsMapper";
    private static final int MAX_RESOLUTION_CANDIDATES_PER_REQUEST = 100;
    private final ag1 callParams;
    private final q2a okApi;
    private final a4c rtcLog;

    public ExternalToInternalIdsMapper(q2a q2aVar, ag1 ag1Var, a4c a4cVar) {
        this.okApi = q2aVar;
        this.callParams = ag1Var;
        this.rtcLog = a4cVar;
    }

    private final void applyInternalIds(BatchInternalIdResponse response, Map<ParticipantId, bg1> ids) {
        if (response == null) {
            return;
        }
        Map<ParticipantId, bg1> map = response.externalToInternalIdsMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<ParticipantId, bg1> entry : map.entrySet()) {
            ParticipantId key = entry.getKey();
            bg1 value = entry.getValue();
            if (key != null && value != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ids.putAll(linkedHashMap);
    }

    private final String constructRequestIdsParameter(List<ParticipantId> candidates) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (ParticipantId participantId : candidates) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", participantId.id);
            jSONObject.put("ok_anonym", participantId.isAnon);
            jSONArray.put(jSONObject);
        }
        return jSONArray.toString();
    }

    private final List<ParticipantId> filterEmptyParticipantIds(Collection<ParticipantId> from) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : from) {
            ParticipantId participantId = (ParticipantId) obj;
            if (participantId.id.length() == 0) {
                this.rtcLog.reportException(LOG_TAG, "Empty participant id", new IllegalArgumentException("Empty participant id"));
            }
            if (participantId.id.length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final List<sk0> getBatchedResolveInternalIdsRequests(Collection<ParticipantId> candidates) {
        ArrayList arrayListI0 = x53.I0(candidates, 100, 100);
        ArrayList arrayList = new ArrayList(z53.S(arrayListI0, 10));
        Iterator it = arrayListI0.iterator();
        while (it.hasNext()) {
            arrayList.add(getResolveInternalIdsRequestsForCandidates((List) it.next()));
        }
        return arrayList;
    }

    private final sk0 getResolveInternalIdsRequestsForCandidates(List<ParticipantId> candidates) {
        rk0 rk0VarS = tu0.s("vchat.getOkIdsByExternalIds");
        rk0VarS.b = kl.c;
        rk0VarS.c.a(new n9e(ApiProtocol.PARAM_EXTERNAL_IDS, constructRequestIdsParameter(candidates)));
        return rk0VarS.a(BatchInternalIdResponse.PARSER);
    }

    @Override // ru.ok.android.externcalls.sdk.id.mapping.IdsMapper
    public Map<ParticipantId, bg1> map(Collection<? extends ParticipantId> from) {
        boolean z = jb9.a;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Background thread expected");
        }
        List<ParticipantId> listFilterEmptyParticipantIds = filterEmptyParticipantIds(from);
        if (listFilterEmptyParticipantIds.isEmpty()) {
            return oz4.a;
        }
        List<sk0> batchedResolveInternalIdsRequests = getBatchedResolveInternalIdsRequests(listFilterEmptyParticipantIds);
        Uri uri = bl0.X;
        ArrayList arrayList = new ArrayList();
        for (sk0 sk0Var : batchedResolveInternalIdsRequests) {
            arrayList.add(new il(sk0Var, sk0Var));
        }
        cl0 cl0Var = (cl0) RetryKt.retryApiCallForFastWorkRequired(this.okApi.c().a(new bl0(null, (il[]) arrayList.toArray(new il[0]), 0)), this.callParams.B.h, this.rtcLog).e();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<sk0> it = batchedResolveInternalIdsRequests.iterator();
        while (it.hasNext()) {
            applyInternalIds((BatchInternalIdResponse) cl0Var.a(it.next()), linkedHashMap);
        }
        return linkedHashMap;
    }
}
