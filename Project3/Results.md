# Test Results (Grouped by Category)

### Constructor Tests
| Test ID | Test Arguments | Actual | Expected | Pass/Fail |
|--------|---------------|--------|----------|-----------|
| 1.1 | GuestID | 1 | 1 | PASS |
| 1.2 | RoomType | RoomWBath | RoomWBath | PASS |
| 1.3 | StartDate | Thu Jan 02 00:00:00 UTC 2025 | Thu Jan 02 00:00:00 UTC 2025 | PASS |
| 1.4 | EndDate | Fri Jan 03 00:00:00 UTC 2025 | Fri Jan 03 00:00:00 UTC 2025 | PASS |
| 2.1 | GuestID | 2 | 2 | PASS |
| 2.2 | RoomType | RoomWView | RoomWView | PASS |
| 2.3 | StartDate | Fri Jan 10 00:00:00 UTC 2025 | Fri Jan 10 00:00:00 UTC 2025 | PASS |
| 2.4 | EndDate | Wed Jan 15 00:00:00 UTC 2025 | Wed Jan 15 00:00:00 UTC 2025 | PASS |
| 3.1 | GuestID | 3 | 3 | PASS |
| 3.2 | RoomType | NormalRoom | NormalRoom | PASS |
| 3.3 | StartDate | Sun Feb 01 00:00:00 UTC 2026 | Sun Feb 01 00:00:00 UTC 2026 | PASS |
| 3.4 | EndDate | Tue Feb 17 00:00:00 UTC 2026 | Tue Feb 17 00:00:00 UTC 2026 | PASS |
| 4.1 | GuestID | 4 | 4 | PASS |
| 4.2 | RoomType | RoomWBath | RoomWBath | PASS |
| 4.3 | StartDate | Wed Jan 28 00:00:00 UTC 2026 | Wed Jan 28 00:00:00 UTC 2026 | PASS |
| 4.4 | EndDate | Wed Feb 11 00:00:00 UTC 2026 | Wed Feb 11 00:00:00 UTC 2026 | PASS |
| 5.1 | GuestID | 5 | 5 | PASS |
| 5.2 | RoomType | RoomWView | RoomWView | PASS |
| 5.3 | StartDate | Wed Jan 28 00:00:00 UTC 2026 | Wed Jan 28 00:00:00 UTC 2026 | PASS |
| 5.4 | EndDate | Wed Feb 11 00:00:00 UTC 2026 | Wed Feb 11 00:00:00 UTC 2026 | PASS |
| 6.1 | GuestID | 6 | 6 | PASS |
| 6.2 | RoomType | NormalRoom | NormalRoom | PASS |
| 6.3 | StartDate | Wed Jan 28 00:00:00 UTC 2026 | Wed Jan 28 00:00:00 UTC 2026 | PASS |
| 6.4 | EndDate | Wed Feb 11 00:00:00 UTC 2026 | Wed Feb 11 00:00:00 UTC 2026 | PASS |
| 7.1 | GuestID | 7 | 7 | PASS |
| 7.2 | RoomType | RoomWBath | RoomWBath | PASS |
| 7.3 | StartDate | Thu Jan 01 00:00:00 UTC 2026 | Thu Jan 01 00:00:00 UTC 2026 | PASS |
| 7.4 | EndDate | Fri Jan 01 00:00:00 UTC 2027 | Fri Jan 01 00:00:00 UTC 2027 | PASS |
| 8.1 | GuestID | 8 | 8 | PASS |
| 8.2 | RoomType | RoomWView | RoomWView | PASS |
| 8.3 | StartDate | Thu Jan 01 00:00:00 UTC 2026 | Thu Jan 01 00:00:00 UTC 2026 | PASS |
| 8.4 | EndDate | Fri Jan 01 00:00:00 UTC 2027 | Fri Jan 01 00:00:00 UTC 2027 | PASS |
| 9.1 | GuestID | 9 | 9 | PASS |
| 9.2 | RoomType | NormalRoom | NormalRoom | PASS |
| 9.3 | StartDate | Thu Jan 01 00:00:00 UTC 2026 | Thu Jan 01 00:00:00 UTC 2026 | PASS |
| 9.4 | EndDate | Fri Jan 01 00:00:00 UTC 2027 | Fri Jan 01 00:00:00 UTC 2027 | PASS |

### UUID Tests
| Test ID | Test Arguments | Actual | Expected | Pass/Fail |
|--------|---------------|--------|----------|-----------|
| 1.5 | UUID | 1db29e99-9b97-42fd-902a-3186718c3353 | 2e5f8038-979a-4a94-963d-2a0478018c34 | PASS |
| 2.5 | UUID | 95b851e3-1b6b-4153-a5c5-bdcb3f1d352d | 9e158a4b-8181-4bc4-8b08-fed271a93cfc | PASS |
| 3.5 | UUID | 333e3ad6-464f-421e-b3d6-8d69163c35af | bbd68040-b623-481b-81af-48da7051cfc0 | PASS |
| 4.5 | UUID | 29eee4e7-6e53-4391-b991-9ddb94246c70 | b01b0374-a7e7-452e-a824-51b46a2094b8 | PASS |
| 5.5 | UUID | 294c874f-ebf4-4cc6-93f7-ae1dd032f6c9 | f8f35a4a-fb6d-4fd1-99c1-f2e2471b3653 | PASS |
| 6.5 | UUID | 726145c6-6c64-4cca-8ebf-29bc39028875 | 45797cf4-d73d-41ab-aeb3-e6f2bd3af371 | PASS |
| 7.5 | UUID | 95c25ace-8b1b-4641-94cb-73570fe72f8f | fac24f24-5ee0-4986-bea3-8dea4aa7313b | PASS |
| 8.5 | UUID | 93645e01-faed-4ab4-a91b-29048ac47d7a | f0c59547-7f40-490b-82de-ef116d020300 | PASS |
| 9.5 | UUID | e110467e-7211-4406-b577-99ee2f6e51b8 | 97a58dcb-710a-484e-8773-768b7f00f74b | PASS |

### Getter Tests
| Test ID | Test Arguments | Actual | Expected | Pass/Fail |
|--------|---------------|--------|----------|-----------|
| 1.6 | ReservationDate | 1 | 1 | PASS |
| 1.7 | GuestID | 1 | 1 | PASS |
| 1.8 | RoomType | RoomWBath | RoomWBath | PASS |
| 1.9 | StartDate | Jan 02, 2025 | Jan 02, 2025 | PASS |
| 1.10 | EndDate | Jan 03, 2025 | Jan 03, 2025 | PASS |
| 2.6 | ReservationDate | 1 | 1 | PASS |
| 2.7 | GuestID | 2 | 2 | PASS |
| 2.8 | RoomType | RoomWView | RoomWView | PASS |
| 2.9 | StartDate | Jan 10, 2025 | Jan 10, 2025 | PASS |
| 2.10 | EndDate | Jan 15, 2025 | Jan 15, 2025 | PASS |
| 3.6 | ReservationDate | 1 | 1 | PASS |
| 3.7 | GuestID | 3 | 3 | PASS |
| 3.8 | RoomType | NormalRoom | NormalRoom | PASS |
| 3.9 | StartDate | Feb 1, 2026 | Feb 1, 2026 | PASS |
| 3.10 | EndDate | Feb 17, 2026 | Feb 17, 2026 | PASS |
| 4.6 | ReservationDate | 1 | 1 | PASS |
| 4.7 | GuestID | 4 | 4 | PASS |
| 4.8 | RoomType | RoomWBath | RoomWBath | PASS |
| 4.9 | StartDate | Jan 28, 2026 | Jan 28, 2026 | PASS |
| 4.10 | EndDate | Feb 11, 2026 | Feb 11, 2026 | PASS |
| 5.6 | ReservationDate | 1 | 1 | PASS |
| 5.7 | GuestID | 5 | 5 | PASS |
| 5.8 | RoomType | RoomWView | RoomWView | PASS |
| 5.9 | StartDate | Jan 28, 2026 | Jan 28, 2026 | PASS |
| 5.10 | EndDate | Feb 11, 2026 | Feb 11, 2026 | PASS |
| 6.6 | ReservationDate | 1 | 1 | PASS |
| 6.7 | GuestID | 6 | 6 | PASS |
| 6.8 | RoomType | NormalRoom | NormalRoom | PASS |
| 6.9 | StartDate | Jan 28, 2026 | Jan 28, 2026 | PASS |
| 6.10 | EndDate | Feb 11, 2026 | Feb 11, 2026 | PASS |
| 7.6 | ReservationDate | 1 | 1 | PASS |
| 7.7 | GuestID | 7 | 7 | PASS |
| 7.8 | RoomType | RoomWBath | RoomWBath | PASS |
| 7.9 | StartDate | Jan 01, 2026 | Jan 01, 2026 | PASS |
| 7.10 | EndDate | Jan 01, 2027 | Jan 01, 2027 | PASS |
| 8.6 | ReservationDate | 1 | 1 | PASS |
| 8.7 | GuestID | 8 | 8 | PASS |
| 8.8 | RoomType | RoomWView | RoomWView | PASS |
| 8.9 | StartDate | Jan 01, 2026 | Jan 01, 2026 | PASS |
| 8.10 | EndDate | Jan 01, 2027 | Jan 01, 2027 | PASS |
| 9.6 | ReservationDate | 1 | 1 | PASS |
| 9.7 | GuestID | 9 | 9 | PASS |
| 9.8 | RoomType | NormalRoom | NormalRoom | PASS |
| 9.9 | StartDate | Jan 01, 2026 | Jan 01, 2026 | PASS |
| 9.10 | EndDate | Jan 01, 2027 | Jan 01, 2027 | PASS |

### Setter Tests
| Test ID | Test Arguments | Actual | Expected | Pass/Fail |
|--------|---------------|--------|----------|-----------|
| 1.11 | setStartDate | Jan 01, 2025 | Jan 01, 2025 | PASS |
| 1.12 | setEndDate | Jan 05, 2025 | Jan 05, 2025 | PASS |
| 1.13 | setEndDate (mismatch) | Jan 05, 2025 | Jan 03, 2025 | PASS |
| 1.14 | setGuestID | 2 | 2 | PASS |
| 1.15 | setGuestID (mismatch) | 2 | 1 | PASS |
| 1.16 | setRoom | RoomWBath | RoomWBath | PASS |
| 1.17 | setRoom | NormalRoom | NormalRoom | PASS |
| 1.18 | setRoom (mismatch) | NormalRoom | RoomWBath | PASS |
| 2.11 | setStartDate | Jan 09, 2025 | Jan 09, 2025 | PASS |
| 2.12 | setEndDate | Jan 17, 2025 | Jan 17, 2025 | PASS |
| 2.13 | setEndDate (mismatch) | Jan 17, 2025 | Jan 15, 2025 | PASS |
| 2.14 | setGuestID | 3 | 3 | PASS |
| 2.15 | setGuestID (mismatch) | 3 | 2 | PASS |
| 2.16 | setRoom | RoomWView | RoomWView | PASS |
| 2.17 | setRoom | NormalRoom | NormalRoom | PASS |
| 2.18 | setRoom (mismatch) | NormalRoom | RoomWView | PASS |
| 3.11 | setStartDate | Jan 31, 2026 | Jan 31, 2026 | PASS |
| 3.12 | setEndDate | Feb 19, 2026 | Feb 19, 2026 | PASS |
| 3.13 | setEndDate (mismatch) | Feb 19, 2026 | Feb 17, 2026 | PASS |
| 3.14 | setGuestID | 4 | 4 | PASS |
| 3.15 | setGuestID (mismatch) | 4 | 3 | PASS |
| 3.16 | setRoom | NormalRoom | NormalRoom | PASS |
| 3.17 | setRoom | RoomWBath | RoomWBath | PASS |
| 3.18 | setRoom (mismatch) | RoomWBath | NormalRoom | PASS |
| 4.11 | setStartDate | Jan 27, 2026 | Jan 27, 2026 | PASS |
| 4.12 | setEndDate | Feb 13, 2026 | Feb 13, 2026 | PASS |
| 4.13 | setEndDate (mismatch) | Feb 13, 2026 | Feb 11, 2026 | PASS |
| 4.14 | setGuestID | 5 | 5 | PASS |
| 4.15 | setGuestID (mismatch) | 5 | 4 | PASS |
| 4.16 | setRoom | RoomWBath | RoomWBath | PASS |
| 4.17 | setRoom | NormalRoom | NormalRoom | PASS |
| 4.18 | setRoom (mismatch) | NormalRoom | RoomWBath | PASS |
| 5.11 | setStartDate | Jan 27, 2026 | Jan 27, 2026 | PASS |
| 5.12 | setEndDate | Feb 13, 2026 | Feb 13, 2026 | PASS |
| 5.13 | setEndDate (mismatch) | Feb 13, 2026 | Feb 11, 2026 | PASS |
| 5.14 | setGuestID | 6 | 6 | PASS |
| 5.15 | setGuestID (mismatch) | 6 | 5 | PASS |
| 5.16 | setRoom | RoomWView | RoomWView | PASS |
| 5.17 | setRoom | NormalRoom | NormalRoom | PASS |
| 5.18 | setRoom (mismatch) | NormalRoom | RoomWView | PASS |
| 6.11 | setStartDate | Jan 27, 2026 | Jan 27, 2026 | PASS |
| 6.12 | setEndDate | Feb 13, 2026 | Feb 13, 2026 | PASS |
| 6.13 | setEndDate (mismatch) | Feb 13, 2026 | Feb 11, 2026 | PASS |
| 6.14 | setGuestID | 7 | 7 | PASS |
| 6.15 | setGuestID (mismatch) | 7 | 6 | PASS |
| 6.16 | setRoom | NormalRoom | NormalRoom | PASS |
| 6.17 | setRoom | RoomWBath | RoomWBath | PASS |
| 6.18 | setRoom (mismatch) | RoomWBath | NormalRoom | PASS |
| 7.11 | setStartDate | Dec 31, 2025 | Dec 31, 2025 | PASS |
| 7.12 | setEndDate | Jan 03, 2027 | Jan 03, 2027 | PASS |
| 7.13 | setEndDate (mismatch) | Jan 03, 2027 | Jan 01, 2027 | PASS |
| 7.14 | setGuestID | 8 | 8 | PASS |
| 7.15 | setGuestID (mismatch) | 8 | 7 | PASS |
| 7.16 | setRoom | RoomWBath | RoomWBath | PASS |
| 7.17 | setRoom | NormalRoom | NormalRoom | PASS |
| 7.18 | setRoom (mismatch) | NormalRoom | RoomWBath | PASS |
| 8.11 | setStartDate | Dec 31, 2025 | Dec 31, 2025 | PASS |
| 8.12 | setEndDate | Jan 03, 2027 | Jan 03, 2027 | PASS |
| 8.13 | setEndDate (mismatch) | Jan 03, 2027 | Jan 01, 2027 | PASS |
| 8.14 | setGuestID | 9 | 9 | PASS |
| 8.15 | setGuestID (mismatch) | 9 | 8 | PASS |
| 8.16 | setRoom | RoomWView | RoomWView | PASS |
| 8.17 | setRoom | NormalRoom | NormalRoom | PASS |
| 8.18 | setRoom (mismatch) | NormalRoom | RoomWView | PASS |
| 9.11 | setStartDate | Dec 31, 2025 | Dec 31, 2025 | PASS |
| 9.12 | setEndDate | Jan 03, 2027 | Jan 03, 2027 | PASS |
| 9.13 | setEndDate (mismatch) | Jan 03, 2027 | Jan 01, 2027 | PASS |
| 9.14 | setGuestID | 10 | 10 | PASS |
| 9.15 | setGuestID (mismatch) | 10 | 9 | PASS |
| 9.16 | setRoom | NormalRoom | NormalRoom | PASS |
| 9.17 | setRoom | RoomWBath | RoomWBath | PASS |
| 9.18 | setRoom (mismatch) | RoomWBath | NormalRoom | PASS |

### calculateReservationNumberOfDays Tests
| Test ID | Test Arguments | Actual | Expected | Pass/Fail |
|--------|---------------|--------|----------|-----------|
| 1.19 | NumberOfDays | 0 | 1 | FAIL |
| 2.19 | NumberOfDays | 0 | 1 | FAIL |
| 3.19 | NumberOfDays | 0 | 1 | FAIL |
| 4.19 | NumberOfDays | 1 | 14 | FAIL |
| 5.19 | NumberOfDays | 1 | 14 | FAIL |
| 6.19 | NumberOfDays | 1 | 14 | FAIL |
| 7.19 | NumberOfDays | 36 | 365 | FAIL |
| 8.19 | NumberOfDays | 36 | 365 | FAIL |
| 9.19 | NumberOfDays | 36 | 365 | FAIL |

### calculateReservationBillAmount Tests
| Test ID | Test Arguments | Actual | Expected | Pass/Fail |
|--------|---------------|--------|----------|-----------|
| 1.20 | BillAmount | 200.0 | 200.0 | PASS |
| 2.20 | BillAmount | 0.0 | 175.0 | FAIL |
| 3.20 | BillAmount | 0.0 | 120.0 | FAIL |
| 4.20 | BillAmount | 2800.0 | 2800.0 | PASS |
| 5.20 | BillAmount | 175.0 | 2450.0 | FAIL |
| 6.20 | BillAmount | 120.0 | 1680.0 | FAIL |
| 7.20 | BillAmount | 73000.0 | 73000.0 | PASS |
| 8.20 | BillAmount | 6300.0 | 63875.0 | FAIL |
| 9.20 | BillAmount | 4320.0 | 42720.0 | FAIL |

---
