import { registerPlugin } from '@capacitor/core';

import type { SunmiRFIDPlugin } from './definitions';

const SunmiRFID = registerPlugin<SunmiRFIDPlugin>('SunmiRFID', {
  web: () => import('./web').then(m => new m.SunmiRFIDWeb()),
});

export * from './definitions';
export { SunmiRFID };
