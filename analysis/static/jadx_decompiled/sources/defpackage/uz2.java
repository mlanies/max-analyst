package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* loaded from: classes2.dex */
public final class uz2 {
    public final jp4 a;

    public uz2(jp4 jp4Var) {
        this.a = jp4Var;
    }

    public final k92 a(byte[] bArr) throws ProtoException {
        j92 j92Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        Map<Long, Protos.Chat.AdminParticipant> map;
        byte[] bArr2 = b.a;
        try {
            Protos.Chat chat = (Protos.Chat) qw8.mergeFrom(new Protos.Chat(), bArr);
            u82 u82Var = new u82();
            u82Var.a = chat.serverId;
            int i = chat.type;
            if (i != 0) {
                j92Var = j92.b;
                if (i != 1) {
                    if (i == 2) {
                        j92Var = j92.c;
                    } else if (i == 3) {
                        j92Var = j92.o;
                    }
                }
            } else {
                j92Var = j92.a;
            }
            u82Var.b = j92Var;
            int i2 = chat.status;
            i92 i92Var = i92.a;
            switch (i2) {
                case 1:
                    i92Var = i92.b;
                    break;
                case 2:
                    i92Var = i92.c;
                    break;
                case 3:
                    i92Var = i92.o;
                    break;
                case 4:
                    i92Var = i92.X;
                    break;
                case 5:
                    i92Var = i92.Y;
                    break;
                case 6:
                    i92Var = i92.Z;
                    break;
            }
            u82Var.c = i92Var;
            u82Var.d = chat.owner;
            u82Var.e = chat.participants;
            u82Var.f = chat.created;
            u82Var.g = chat.title;
            u82Var.h = chat.baseIconUrl;
            u82Var.i = chat.baseRawIconUrl;
            u82Var.j = chat.lastMessageId;
            u82Var.k = chat.lastEventTime;
            u82Var.P = chat.joinTime;
            u82Var.l = chat.cid;
            u82Var.m = chat.newMessages;
            u82Var.l0 = chat.markedAsUnread;
            Protos.Chat.Chunk[] chunkArr = chat.chunk;
            if (chunkArr != null && chunkArr.length > 0) {
                for (Protos.Chat.Chunk chunk : chunkArr) {
                    u82Var.n.a(b.i(chunk), mg4.REGULAR);
                }
            }
            Protos.Chat.Chunk[] chunkArr2 = chat.delayedChunk;
            if (chunkArr2 != null && chunkArr2.length > 0) {
                for (Protos.Chat.Chunk chunk2 : chunkArr2) {
                    u82Var.n.a(b.i(chunk2), mg4.DELAYED);
                }
            }
            u82Var.o = chat.lastInput;
            Protos.Chat.ChatSettings chatSettings = chat.chatSettings;
            if (chatSettings != null) {
                a92 a92Var = new a92();
                a92Var.c = chatSettings.lastNotifMark;
                a92Var.d = chatSettings.lastNotifMessageId;
                a92Var.a = chatSettings.dontDisturbUntil;
                int[] iArr = chatSettings.options;
                if (iArr != null && iArr.length > 0) {
                    for (int i3 : iArr) {
                        if (i3 == 0) {
                            a92Var.a(y82.a);
                        } else if (i3 == 1) {
                            a92Var.a(y82.b);
                        } else if (i3 == 2) {
                            a92Var.a(y82.c);
                        }
                    }
                }
                a92Var.e = chatSettings.favoriteIndex;
                a92Var.f = chatSettings.hideMyLiveLocationPanelBeforeTime;
                a92Var.g = chatSettings.hideLiveLocationPanelBeforeTime;
                u82Var.p = new b92(a92Var);
            }
            Protos.Chat.ChatMedia chatMedia = chat.mediaAll;
            if (chatMedia != null) {
                u82Var.q = b.g(chatMedia);
            }
            Protos.Chat.ChatMedia chatMedia2 = chat.mediaPhotoVideo;
            if (chatMedia2 != null) {
                u82Var.r = b.g(chatMedia2);
            }
            Protos.Chat.ChatMedia chatMedia3 = chat.mediaMusic;
            if (chatMedia3 != null) {
                u82Var.t = b.g(chatMedia3);
            }
            Protos.Chat.ChatMedia chatMedia4 = chat.mediaAudio;
            if (chatMedia4 != null) {
                u82Var.u = b.g(chatMedia4);
            }
            Protos.Chat.ChatMedia chatMedia5 = chat.mediaFiles;
            if (chatMedia5 != null) {
                u82Var.v = b.g(chatMedia5);
            }
            Protos.Chat.ChatMedia chatMedia6 = chat.mediaLocations;
            if (chatMedia6 != null) {
                u82Var.w = b.g(chatMedia6);
            }
            Protos.Chat.ChatMedia chatMedia7 = chat.mediaShare;
            if (chatMedia7 != null) {
                u82Var.s = b.g(chatMedia7);
            }
            u82Var.x = chat.firstMessageId;
            Protos.Chat.Section[] sectionArr = chat.sections;
            if (sectionArr != null && sectionArr.length > 0) {
                for (Protos.Chat.Section section : sectionArr) {
                    s7 s7Var = new s7();
                    s7Var.c = section.id;
                    s7Var.d = section.title;
                    long[] jArr = section.stickers;
                    if (jArr != null) {
                        s7Var.e = nd7.i(jArr);
                    }
                    s7Var.a = section.marker;
                    s7Var.b = section.collapsed;
                    h92 h92Var = new h92(s7Var);
                    if (u82Var.y == null) {
                        u82Var.y = new ArrayList();
                    }
                    u82Var.y.add(h92Var);
                }
            }
            String[] strArr = chat.stickersOrder;
            if (strArr != null && strArr.length > 0) {
                u82Var.z = Arrays.asList(strArr);
            }
            u82Var.A = chat.stickersSyncTime;
            int[] iArr2 = chat.localChanges;
            if (iArr2 != null && iArr2.length > 0) {
                for (int i4 : iArr2) {
                    if (i4 == 0) {
                        u82Var.a(v82.a);
                    } else if (i4 == 1) {
                        u82Var.a(v82.b);
                    } else if (i4 == 2) {
                        u82Var.a(v82.c);
                    } else if (i4 == 3) {
                        u82Var.a(v82.o);
                    }
                }
            }
            Protos.Chat.ChatSubject chatSubject = chat.chatSubject;
            if (chatSubject != null) {
                long[] jArr2 = chatSubject.organizationIds;
                if (jArr2.length > 0) {
                    u82Var.D = new c92(jArr2);
                }
            }
            Protos.Chat.ChannelInfo channelInfo = chat.channelInfo;
            if (channelInfo != null) {
                chat.participantsCount = channelInfo.membersCount;
                chat.description = channelInfo.description;
                chat.admins = channelInfo.admins;
                if (channelInfo.signAdmin) {
                    Protos.Chat.ChatOptions chatOptions = new Protos.Chat.ChatOptions();
                    chatOptions.signAdmin = true;
                    chat.chatOptions = chatOptions;
                }
            }
            if (chat.participantsCount == 0 && u82Var.d().size() > 0) {
                chat.participantsCount = u82Var.d().size();
            }
            u82Var.G = chat.participantsCount;
            u82Var.H = chat.description;
            u82Var.I = nd7.i(chat.admins);
            long[] jArr3 = chat.admins;
            if (jArr3 == null || ((map = chat.adminParticipants) != null && jArr3.length <= map.size())) {
                u82Var.e(b.a(chat.adminParticipants));
            } else {
                HashMap map2 = new HashMap();
                Map<Long, Protos.Chat.AdminParticipant> map3 = chat.adminParticipants;
                if (map3 != null) {
                    map2.putAll(b.a(map3));
                }
                for (long j : chat.admins) {
                    if (!map2.containsKey(Long.valueOf(j))) {
                        Long lValueOf = Long.valueOf(j);
                        s82 s82Var = new s82();
                        s82Var.b = j;
                        s82Var.a = 2043;
                        map2.put(lValueOf, new t82(s82Var));
                    }
                }
                u82Var.e(map2);
            }
            u82Var.J = chat.blockedParticipantsCount;
            Protos.Chat.ChatOptions chatOptions2 = chat.chatOptions;
            if (chatOptions2 != null) {
                if (u82Var.K == null) {
                    u82Var.K = z82.j;
                }
                boolean z = u82Var.K.a;
                u82Var.K = new z82(chatOptions2.signAdmin, chatOptions2.onlyOwnerCanChangeIconTitle, chatOptions2.official, chatOptions2.onlyAdminCanAddMember, chatOptions2.allCanPinMessage, chatOptions2.onlyAdminCanCall, chatOptions2.sentByPhone, chatOptions2.serviceChat, chatOptions2.membersCanSeePrivateLink);
            }
            int i5 = chat.accessType;
            if (i5 == 0) {
                u82Var.r0 = 1;
            } else if (i5 == 1) {
                u82Var.r0 = 2;
            }
            u82Var.E = chat.link;
            u82Var.F = new fm5(chat.restrictions, 2);
            Protos.Chat.GroupChatInfo groupChatInfo = chat.groupChatInfo;
            if (groupChatInfo != null) {
                eh6 eh6Var = eh6.b;
                long j2 = groupChatInfo.groupId;
                boolean z2 = groupChatInfo.isAnswered;
                boolean z3 = groupChatInfo.isModerator;
                boolean z4 = groupChatInfo.isImportant;
                String str = groupChatInfo.name;
                String str2 = groupChatInfo.baseIconUrl;
                boolean z5 = groupChatInfo.isCustomTitle;
                boolean z6 = groupChatInfo.isMember;
                Protos.Chat.GroupChatInfo.GroupOptions groupOptions = groupChatInfo.groupOptions;
                if (groupOptions != null) {
                    eh6Var = new eh6(groupOptions.groupPremium);
                }
                eh6 eh6Var2 = eh6Var;
                int i6 = groupChatInfo.messagingPermissions;
                u82Var.C = new f92(j2, z2, z3, z4, str, str2, z5, z6, i6 != 1 ? i6 != 2 ? 1 : 3 : 2, eh6Var2);
            }
            u82Var.L = chat.pinnedMessageId;
            u82Var.M = chat.hidePinnedMessage;
            u82Var.N = chat.unreadReply;
            u82Var.O = chat.unreadPin;
            u82Var.Q = chat.messagesTtlSec;
            u82Var.S = chat.flagsSettings;
            Protos.Chat.VideoConversation videoConversation = chat.videoConversation;
            if (videoConversation != null) {
                long[] jArr4 = videoConversation.previewParticipantIds;
                if (jArr4 != null) {
                    arrayList2 = new ArrayList(jArr4.length);
                    for (long j3 : jArr4) {
                        arrayList2.add(Long.valueOf(j3));
                    }
                } else {
                    arrayList2 = null;
                }
                Protos.Chat.VideoConversation videoConversation2 = chat.videoConversation;
                int i7 = videoConversation2.type;
                int i8 = i7 != 1 ? i7 != 2 ? 1 : 3 : 2;
                k10 k10Var = new k10();
                k10Var.a = videoConversation2.conversationId;
                k10Var.b = videoConversation2.startedAt;
                k10Var.c = videoConversation2.joinLink;
                k10Var.d = videoConversation2.approxParticipantCount;
                k10Var.e = arrayList2;
                k10Var.f = i8;
                u82Var.T = new k10(k10Var);
            }
            u82Var.U = chat.lastOpenPositionTime;
            u82Var.V = chat.lastOpenPositionOffset;
            u82Var.W = chat.lastOpenReadMark;
            u82Var.X = (int) chat.lastOpenNewMessages;
            u82Var.Y = chat.lastSearchClickTime;
            u82Var.Z = chat.lastWriteTime;
            Protos.Chat.LastInputMedia[] lastInputMediaArr = chat.lastInputMedia;
            if (lastInputMediaArr != null) {
                ArrayList arrayList3 = new ArrayList(lastInputMediaArr.length);
                for (Protos.Chat.LastInputMedia lastInputMedia : lastInputMediaArr) {
                    vd7 vd7Var = new vd7();
                    vd7Var.a = lastInputMedia.originalId;
                    vd7Var.b = lastInputMedia.originalUri;
                    vd7Var.c = lastInputMedia.thumbnailUri;
                    vd7Var.d = lastInputMedia.originalOrientation;
                    vd7Var.e = lastInputMedia.originalDuration;
                    vd7Var.f = lastInputMedia.mimeType;
                    vd7Var.g = lastInputMedia.dateModified;
                    vd7Var.h = lastInputMedia.editedUri;
                    vd7Var.k = lastInputMedia.attachLocalId;
                    vd7Var.i = lastInputMedia.type;
                    int[] iArr3 = lastInputMedia.wave;
                    if (iArr3 == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                        for (int i9 : iArr3) {
                            arrayList.add(Integer.valueOf(i9));
                        }
                    }
                    vd7Var.j = arrayList;
                    arrayList3.add(new wd7(vd7Var));
                }
                u82Var.a0 = arrayList3;
            }
            u82Var.b0 = chat.lastInputEditMessageId;
            u82Var.c0 = chat.lastInputReplyMessageId;
            u82Var.f0 = this.a.e(chat.draft);
            u82Var.g0 = chat.draftUpdateTime;
            u82Var.h0 = chat.draftUpdateTimeForSyncLogic;
            Protos.Chat.BotsInfo botsInfo = chat.botsInfo;
            u82Var.d0 = botsInfo == null ? oq0.c : new oq0(botsInfo.hasBots, botsInfo.suspendedBot);
            u82Var.e0 = chat.modified;
            u82Var.j0 = chat.liveLocationMessageIds;
            u82Var.i0 = chat.subscribedToUpdates;
            u82Var.k0 = chat.lastMentionMessageId;
            u82Var.n0 = chat.lastReactedMessageId;
            String str3 = chat.lastReaction;
            if (oag.t(str3)) {
                u82Var.o0 = null;
            } else {
                u82Var.o0 = str3;
            }
            Protos.Chat.PushMessage pushMessage = chat.lastPushMessage;
            if (pushMessage != null) {
                u82Var.m0 = new g92(pushMessage.time, pushMessage.text, pushMessage.id);
            }
            u82Var.q0 = chat.lastFireDelayedErrorTime;
            u82Var.p0 = chat.lastDelayedUpdateTime;
            return new k92(u82Var);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }
}
