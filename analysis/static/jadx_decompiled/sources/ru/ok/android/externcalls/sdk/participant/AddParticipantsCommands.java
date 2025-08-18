package ru.ok.android.externcalls.sdk.participant;

import defpackage.au1;
import defpackage.bg1;
import defpackage.e5f;
import defpackage.f46;
import defpackage.k56;
import defpackage.ka6;
import defpackage.m56;
import defpackage.nz4;
import defpackage.p66;
import defpackage.py0;
import defpackage.qod;
import defpackage.rd7;
import defpackage.rj3;
import defpackage.rod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands;
import ru.ok.android.externcalls.sdk.participant.add.AddParticipantsFailedException;
import ru.ok.android.externcalls.sdk.participant.add.AddParticipantsResult;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u001b\u001a\u00020\u00172\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00152\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\"\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160!¢\u0006\u0004\b\"\u0010#Je\u0010,\u001a\u00020\u00172\u0010\u0010'\u001a\f\u0012\b\u0012\u00060%j\u0002`&0$2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010*\u001a\u00020(2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00152\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00101¨\u00062"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/AddParticipantsCommands;", "", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lpy0;", "call", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "mappings", "Lkotlin/Function0;", "Lru/ok/android/externcalls/sdk/Conversation$State;", "stateProvider", "<init>", "(Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lpy0;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;Lk56;)V", "Lorg/json/JSONObject;", "error", "Lru/ok/android/externcalls/sdk/participant/AddByLinkFailedException;", "parseErrorResponse", "(Lorg/json/JSONObject;)Lru/ok/android/externcalls/sdk/participant/AddByLinkFailedException;", "Lru/ok/android/externcalls/sdk/participant/add/AddParticipantsFailedException;", "parseAddError", "(Lorg/json/JSONObject;)Lru/ok/android/externcalls/sdk/participant/add/AddParticipantsFailedException;", "Lkotlin/Function1;", "", "Le5f;", "onError", "Lrod;", "provideSignaling", "withSignaling", "(Lm56;Lm56;)V", "", "link", "Ljava/lang/Runnable;", "onSuccess", "Lrj3;", "addParticipantByLink", "(Ljava/lang/String;Ljava/lang/Runnable;Lrj3;)V", "", "Lbg1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "participantsIds", "", "isUnban", "isShowChatHistory", "Lru/ok/android/externcalls/sdk/participant/add/AddParticipantsResult;", "addParticipants", "(Ljava/util/Collection;Ljava/lang/Boolean;ZLm56;Lm56;)V", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lpy0;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "Lk56;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AddParticipantsCommands {
    private final py0 call;
    private final IdMappingWrapper mappings;
    private final SignalingProvider signalingProvider;
    private final k56 stateProvider;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands$addParticipantByLink$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends p66 implements m56 {
        public AnonymousClass1(Object obj) {
            super(1, 0, rj3.class, obj, "accept", "accept(Ljava/lang/Object;)V");
        }

        @Override // defpackage.m56
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return e5f.a;
        }

        public final void invoke(Throwable th) {
            ((rj3) this.receiver).accept(th);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrod;", "signaling", "Le5f;", "invoke", "(Lrod;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands$addParticipantByLink$2, reason: invalid class name */
    public static final class AnonymousClass2 extends rd7 implements m56 {
        final /* synthetic */ String $link;
        final /* synthetic */ rj3 $onError;
        final /* synthetic */ Runnable $onSuccess;
        final /* synthetic */ AddParticipantsCommands this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, rj3 rj3Var, Runnable runnable, AddParticipantsCommands addParticipantsCommands) {
            super(1);
            this.$link = str;
            this.$onError = rj3Var;
            this.$onSuccess = runnable;
            this.this$0 = addParticipantsCommands;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$1(rj3 rj3Var, AddParticipantsCommands addParticipantsCommands, JSONObject jSONObject) {
            rj3Var.accept(addParticipantsCommands.parseErrorResponse(jSONObject));
        }

        @Override // defpackage.m56
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((rod) obj);
            return e5f.a;
        }

        public final void invoke(rod rodVar) {
            try {
                String str = this.$link;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("participantIdAsQRCodeLink", str);
                ka6 ka6VarB = f46.b(jSONObject, "add-participant");
                final Runnable runnable = this.$onSuccess;
                rodVar.d(ka6VarB, false, new qod() { // from class: ru.ok.android.externcalls.sdk.participant.a
                    @Override // defpackage.qod
                    public final void j(JSONObject jSONObject2) {
                        runnable.run();
                    }
                }, new b(this.$onError, this.this$0, 0));
            } catch (JSONException e) {
                this.$onError.accept(new RuntimeException("Request preparation error", e));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrod;", "signaling", "Le5f;", "invoke", "(Lrod;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands$addParticipants$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00391 extends rd7 implements m56 {
        final /* synthetic */ boolean $isShowChatHistory;
        final /* synthetic */ Boolean $isUnban;
        final /* synthetic */ m56 $onError;
        final /* synthetic */ m56 $onSuccess;
        final /* synthetic */ Collection<bg1> $participantsIds;
        final /* synthetic */ AddParticipantsCommands this$0;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands$addParticipants$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[au1.v(2).length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00391(Collection<bg1> collection, Boolean bool, boolean z, m56 m56Var, AddParticipantsCommands addParticipantsCommands, m56 m56Var2) {
            super(1);
            this.$participantsIds = collection;
            this.$isUnban = bool;
            this.$isShowChatHistory = z;
            this.$onError = m56Var;
            this.this$0 = addParticipantsCommands;
            this.$onSuccess = m56Var2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$4(AddParticipantsCommands addParticipantsCommands, m56 m56Var, m56 m56Var2, JSONObject jSONObject) {
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (jSONObject.has("participants")) {
                    JSONArray jSONArray = jSONObject.getJSONArray("participants");
                    int length = jSONObject.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject != null) {
                            bg1 bg1VarF = f46.F(jSONObjectOptJSONObject);
                            int iS = au1.s(addParticipantsCommands.call.y(bg1VarF, jSONObjectOptJSONObject));
                            if (iS == 0) {
                                arrayList.add(bg1VarF);
                            } else if (iS == 1) {
                                arrayList2.add(bg1VarF);
                            }
                        }
                    }
                }
                if (m56Var != null) {
                    List listN = f46.N(jSONObject, "rejectedParticipantIds");
                    List list = nz4.a;
                    if (listN == null) {
                        listN = list;
                    }
                    List listN2 = f46.N(jSONObject, "bannedParticipantIds");
                    if (listN2 != null) {
                        list = listN2;
                    }
                    IdMappingWrapper idMappingWrapper = addParticipantsCommands.mappings;
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ParticipantId byInternal = idMappingWrapper.getByInternal((bg1) it.next());
                        if (byInternal != null) {
                            arrayList3.add(byInternal);
                        }
                    }
                    IdMappingWrapper idMappingWrapper2 = addParticipantsCommands.mappings;
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ParticipantId byInternal2 = idMappingWrapper2.getByInternal((bg1) it2.next());
                        if (byInternal2 != null) {
                            arrayList4.add(byInternal2);
                        }
                    }
                    IdMappingWrapper idMappingWrapper3 = addParticipantsCommands.mappings;
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it3 = listN.iterator();
                    while (it3.hasNext()) {
                        ParticipantId byInternal3 = idMappingWrapper3.getByInternal((bg1) it3.next());
                        if (byInternal3 != null) {
                            arrayList5.add(byInternal3);
                        }
                    }
                    IdMappingWrapper idMappingWrapper4 = addParticipantsCommands.mappings;
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        ParticipantId byInternal4 = idMappingWrapper4.getByInternal((bg1) it4.next());
                        if (byInternal4 != null) {
                            arrayList6.add(byInternal4);
                        }
                    }
                    m56Var.invoke(new AddParticipantsResult(arrayList3, arrayList4, arrayList5, arrayList6));
                }
            } catch (JSONException e) {
                if (m56Var2 != null) {
                    m56Var2.invoke(new RuntimeException("add.participant.success", e));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$5(m56 m56Var, AddParticipantsCommands addParticipantsCommands, JSONObject jSONObject) {
            if (m56Var != null) {
                m56Var.invoke(addParticipantsCommands.parseAddError(jSONObject));
            }
        }

        @Override // defpackage.m56
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((rod) obj);
            return e5f.a;
        }

        public final void invoke(rod rodVar) {
            try {
                ka6 ka6VarF = f46.f(this.$participantsIds, this.$isUnban, this.$isShowChatHistory);
                final AddParticipantsCommands addParticipantsCommands = this.this$0;
                final m56 m56Var = this.$onSuccess;
                final m56 m56Var2 = this.$onError;
                rodVar.d(ka6VarF, false, new qod() { // from class: ru.ok.android.externcalls.sdk.participant.c
                    @Override // defpackage.qod
                    public final void j(JSONObject jSONObject) {
                        AddParticipantsCommands.C00391.invoke$lambda$4(addParticipantsCommands, m56Var, m56Var2, jSONObject);
                    }
                }, new b(m56Var2, addParticipantsCommands, 1));
            } catch (JSONException e) {
                m56 m56Var3 = this.$onError;
                if (m56Var3 != null) {
                    m56Var3.invoke(new RuntimeException("add.participant", e));
                }
            }
        }
    }

    public AddParticipantsCommands(SignalingProvider signalingProvider, py0 py0Var, IdMappingWrapper idMappingWrapper, k56 k56Var) {
        this.signalingProvider = signalingProvider;
        this.call = py0Var;
        this.mappings = idMappingWrapper;
        this.stateProvider = k56Var;
    }

    public static /* synthetic */ void addParticipants$default(AddParticipantsCommands addParticipantsCommands, Collection collection, Boolean bool, boolean z, m56 m56Var, m56 m56Var2, int i, Object obj) {
        Boolean bool2 = (i & 2) != 0 ? null : bool;
        if ((i & 4) != 0) {
            z = false;
        }
        addParticipantsCommands.addParticipants(collection, bool2, z, (i & 8) != 0 ? null : m56Var, (i & 16) != 0 ? null : m56Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddParticipantsFailedException parseAddError(JSONObject error) {
        String strOptString = error.optString("message");
        if (strOptString == null) {
            strOptString = "Add participants error: " + error;
        }
        return new AddParticipantsFailedException(strOptString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException parseErrorResponse(org.json.JSONObject r2) {
        /*
            r1 = this;
            java.lang.String r1 = "message"
            java.lang.String r1 = r2.optString(r1)
            if (r1 != 0) goto L16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Add participant by link error: "
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L16:
            java.lang.String r0 = "error"
            java.lang.String r2 = r2.optString(r0)
            if (r2 == 0) goto L6e
            int r0 = r2.hashCode()
            switch(r0) {
                case -1949027499: goto L62;
                case -1148527576: goto L56;
                case -814624751: goto L4a;
                case -506696988: goto L3e;
                case -500593498: goto L32;
                case 1966207640: goto L26;
                default: goto L25;
            }
        L25:
            goto L6e
        L26:
            java.lang.String r0 = "link_is_outdated"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L2f
            goto L6e
        L2f:
            ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException$Reason r2 = ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException.Reason.LINK_OUTDATED
            goto L70
        L32:
            java.lang.String r0 = "wrong_signature"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L3b
            goto L6e
        L3b:
            ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException$Reason r2 = ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException.Reason.WRONG_SIGNATURE
            goto L70
        L3e:
            java.lang.String r0 = "qr.general_error"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L47
            goto L6e
        L47:
            ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException$Reason r2 = ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException.Reason.QR_GENERAL_ERROR
            goto L70
        L4a:
            java.lang.String r0 = "qr.wrong_prefix"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L53
            goto L6e
        L53:
            ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException$Reason r2 = ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException.Reason.QR_WRONG_PREFIX
            goto L70
        L56:
            java.lang.String r0 = "qr.no_user_id_parameter"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L5f
            goto L6e
        L5f:
            ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException$Reason r2 = ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException.Reason.QR_NO_USER_ID_PARAMETER
            goto L70
        L62:
            java.lang.String r0 = "malformed_qr_url"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L6b
            goto L6e
        L6b:
            ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException$Reason r2 = ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException.Reason.MALFORMED_QR_URL
            goto L70
        L6e:
            ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException$Reason r2 = ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException.Reason.UNKNOWN
        L70:
            ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException r0 = new ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands.parseErrorResponse(org.json.JSONObject):ru.ok.android.externcalls.sdk.participant.AddByLinkFailedException");
    }

    private final void withSignaling(m56 onError, m56 provideSignaling) {
        rod signaling = this.signalingProvider.getSignaling();
        if (signaling != null) {
            provideSignaling.invoke(signaling);
        } else if (onError != null) {
            onError.invoke(new IllegalStateException("Conversation is not prepared or already destroyed"));
        }
    }

    public static /* synthetic */ void withSignaling$default(AddParticipantsCommands addParticipantsCommands, m56 m56Var, m56 m56Var2, int i, Object obj) {
        if ((i & 1) != 0) {
            m56Var = null;
        }
        addParticipantsCommands.withSignaling(m56Var, m56Var2);
    }

    public final void addParticipantByLink(String link, Runnable onSuccess, rj3 onError) {
        withSignaling(new AnonymousClass1(onError), new AnonymousClass2(link, onError, onSuccess, this));
    }

    public final void addParticipants(Collection<bg1> participantsIds, Boolean isUnban, boolean isShowChatHistory, m56 onSuccess, m56 onError) {
        if (this.stateProvider.invoke() == Conversation.State.Finished) {
            return;
        }
        withSignaling$default(this, null, new C00391(participantsIds, isUnban, isShowChatHistory, onError, this, onSuccess), 1, null);
    }
}
