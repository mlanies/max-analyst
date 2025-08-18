package ru.ok.android.externcalls.sdk.sessionroom.internal.command;

import defpackage.bg1;
import defpackage.e5f;
import defpackage.f46;
import defpackage.hgc;
import defpackage.k56;
import defpackage.ka6;
import defpackage.m56;
import defpackage.m6f;
import defpackage.mt;
import defpackage.n6f;
import defpackage.n7;
import defpackage.o6f;
import defpackage.rd7;
import defpackage.rod;
import defpackage.uad;
import defpackage.yad;
import defpackage.z53;
import defpackage.zad;
import defpackage.zge;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.sessionroom.admin.AssignParticipantsToRoomsParams;
import ru.ok.android.externcalls.sdk.sessionroom.admin.MoveParticipantParams;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJg\u0010\u0014\u001a\u00020\u00132\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u000e\u0012\f\u0012\b\u0012\u00060\fj\u0002`\r0\u000b0\t2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u000e\u0012\f\u0012\b\u0012\u00060\fj\u0002`\r0\u000b0\t2\u001a\u0010\u0012\u001a\u0016\u0012\b\u0012\u00060\fj\u0002`\r\u0012\b\u0012\u00060\u0010j\u0002`\u00110\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ=\u0010!\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020 2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b!\u0010\"J=\u0010$\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020#2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b$\u0010%J=\u0010&\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00132\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b&\u0010'J=\u0010)\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020(2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b)\u0010*J=\u0010,\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020+2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001bH\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/¨\u00060"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomAdminCommandExecutorImpl;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomCommandExecutorBase;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/command/SessionRoomAdminCommandExecutor;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;", "participantDataProvider", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;)V", "", "Lyad;", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "addToRooms", "removeFromRooms", "Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "externalToInternalIdsMap", "Lo6f;", "buildUpdateRoomsParams", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lo6f;", "Ln7;", "params", "Lkotlin/Function0;", "Le5f;", "onSuccess", "Lkotlin/Function1;", "", "onError", "activateRooms", "(Ln7;Lk56;Lm56;)V", "Lhgc;", "removeRooms", "(Lhgc;Lk56;Lm56;)V", "Lzge;", "switchRoom", "(Lzge;Lk56;Lm56;)V", "updateRooms", "(Lo6f;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;", "assignParticipantsToRooms", "(Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;", "moveParticipant", "(Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;Lk56;Lm56;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SessionRoomAdminCommandExecutorImpl extends SessionRoomCommandExecutorBase implements SessionRoomAdminCommandExecutor {
    private final SessionRoomParticipantsDataProviderImpl participantDataProvider;
    private final SignalingProvider signalingProvider;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "id", "Le5f;", "invoke", "(Lbg1;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutorImpl$moveParticipant$1, reason: invalid class name */
    public static final class AnonymousClass1 extends rd7 implements m56 {
        final /* synthetic */ m56 $onError;
        final /* synthetic */ k56 $onSuccess;
        final /* synthetic */ MoveParticipantParams $params;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MoveParticipantParams moveParticipantParams, k56 k56Var, m56 m56Var) {
            super(1);
            this.$params = moveParticipantParams;
            this.$onSuccess = k56Var;
            this.$onError = m56Var;
        }

        @Override // defpackage.m56
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((bg1) obj);
            return e5f.a;
        }

        public final void invoke(bg1 bg1Var) {
            SessionRoomAdminCommandExecutorImpl sessionRoomAdminCommandExecutorImpl = SessionRoomAdminCommandExecutorImpl.this;
            zad toRoomId = this.$params.getToRoomId();
            if (toRoomId == null) {
                throw new IllegalArgumentException("Session room id is required".toString());
            }
            sessionRoomAdminCommandExecutorImpl.switchRoom(new zge(bg1Var, toRoomId), this.$onSuccess, this.$onError);
        }
    }

    public SessionRoomAdminCommandExecutorImpl(SignalingProvider signalingProvider, SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl) {
        this.signalingProvider = signalingProvider;
        this.participantDataProvider = sessionRoomParticipantsDataProviderImpl;
    }

    private static final void activateRooms$lambda$0(k56 k56Var, JSONObject jSONObject) {
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    private final o6f buildUpdateRoomsParams(Map<yad, ? extends List<ParticipantId>> addToRooms, Map<yad, ? extends List<ParticipantId>> removeFromRooms, Map<ParticipantId, bg1> externalToInternalIdsMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashSet<yad> linkedHashSet = new LinkedHashSet();
        for (Map.Entry<yad, ? extends List<ParticipantId>> entry : addToRooms.entrySet()) {
            linkedHashSet.add(entry.getKey());
            Iterator<ParticipantId> it = entry.getValue().iterator();
            while (it.hasNext()) {
                bg1 bg1Var = externalToInternalIdsMap.get(it.next());
                if (bg1Var != null) {
                    yad key = entry.getKey();
                    Object arrayList = linkedHashMap.get(key);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(key, arrayList);
                    }
                    ((List) arrayList).add(bg1Var);
                }
            }
        }
        for (Map.Entry<yad, ? extends List<ParticipantId>> entry2 : removeFromRooms.entrySet()) {
            linkedHashSet.add(entry2.getKey());
            Iterator<ParticipantId> it2 = entry2.getValue().iterator();
            while (it2.hasNext()) {
                bg1 bg1Var2 = externalToInternalIdsMap.get(it2.next());
                if (bg1Var2 != null) {
                    yad key2 = entry2.getKey();
                    Object arrayList2 = linkedHashMap2.get(key2);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap2.put(key2, arrayList2);
                    }
                    ((List) arrayList2).add(bg1Var2);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(z53.S(linkedHashSet, 10));
        for (yad yadVar : linkedHashSet) {
            m6f m6fVar = new m6f();
            m6fVar.a = yadVar;
            List list = (List) linkedHashMap.get(yadVar);
            if (list != null) {
                m6fVar.b = list;
            }
            List list2 = (List) linkedHashMap2.get(yadVar);
            if (list2 != null) {
                m6fVar.c = list2;
            }
            arrayList4.add(m6fVar);
        }
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        ArrayList arrayList5 = new ArrayList(z53.S(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            m6f m6fVar2 = (m6f) it3.next();
            arrayList5.add(new n6f(m6fVar2.a, (List) m6fVar2.b, (List) m6fVar2.c));
        }
        return new o6f(arrayList5);
    }

    private static final void removeRooms$lambda$2(k56 k56Var, JSONObject jSONObject) {
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void switchRoom$lambda$4(k56 k56Var, JSONObject jSONObject) {
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateRooms$lambda$6(k56 k56Var, JSONObject jSONObject) {
        if (k56Var != null) {
            k56Var.invoke();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void activateRooms(n7 params, k56 onSuccess, m56 onError) {
        throw null;
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void assignParticipantsToRooms(AssignParticipantsToRoomsParams params, k56 onSuccess, m56 onError) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(z53.T(params.getAddParticipantsToRoomsMap().values()));
            linkedHashSet.addAll(z53.T(params.getRemoveParticipantsFromRoomsMap().values()));
            updateRooms(buildUpdateRoomsParams(params.getAddParticipantsToRoomsMap(), params.getRemoveParticipantsFromRoomsMap(), this.participantDataProvider.getInternalIdsByExternal(linkedHashSet)), onSuccess, onError);
        } catch (Throwable th) {
            if (onError != null) {
                onError.invoke(th);
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void moveParticipant(MoveParticipantParams params, k56 onSuccess, m56 onError) {
        ParticipantId participantId = params.getParticipantId();
        if (participantId != null) {
            this.participantDataProvider.resolveInternalIdByExternal(participantId, new AnonymousClass1(params, onSuccess, onError), onError);
            return;
        }
        zad toRoomId = params.getToRoomId();
        if (toRoomId == null) {
            throw new IllegalArgumentException("Session room id is required".toString());
        }
        switchRoom(new zge(null, toRoomId), onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void removeRooms(hgc params, k56 onSuccess, m56 onError) {
        throw null;
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void switchRoom(zge params, k56 onSuccess, m56 onError) {
        rod rodVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (rodVar == null) {
            return;
        }
        rodVar.d(f46.z(params), false, new mt(8, onSuccess), new uad(this, onError, 0));
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutor
    public void updateRooms(o6f params, k56 onSuccess, m56 onError) throws JSONException {
        ka6 ka6Var;
        rod rodVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (rodVar == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "update-rooms");
        Collection<n6f> collection = params.a;
        if (collection == null) {
            ka6Var = new ka6(jSONObject);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (n6f n6fVar : collection) {
                JSONObject jSONObject2 = new JSONObject();
                yad yadVar = n6fVar.a;
                if (yadVar != null) {
                    jSONObject2.put("id", yadVar.a);
                }
                Collection collection2 = n6fVar.b;
                if (collection2 != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        jSONArray2.put(((bg1) it.next()).c());
                    }
                    jSONObject2.put("addParticipantIds", jSONArray2);
                }
                Collection collection3 = n6fVar.c;
                if (collection3 != null) {
                    JSONArray jSONArray3 = new JSONArray();
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        jSONArray3.put(((bg1) it2.next()).c());
                    }
                    jSONObject2.put("removeParticipantIds", jSONArray3);
                }
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("rooms", jSONArray);
            ka6Var = new ka6(jSONObject);
        }
        rodVar.d(ka6Var, false, new mt(9, onSuccess), new uad(this, onError, 1));
    }
}
