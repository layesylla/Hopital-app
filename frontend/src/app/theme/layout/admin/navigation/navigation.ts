export interface NavigationItem {
  id: string;
  title: string;
  type: 'item' | 'collapse' | 'group';
  translate?: string;
  icon?: string;
  hidden?: boolean;
  url?: string;
  classes?: string;
  exactMatch?: boolean;
  external?: boolean;
  target?: boolean;
  breadcrumbs?: boolean;

  children?: NavigationItem[];
}
export const NavigationItems: NavigationItem[] = [
  {
    id: 'navigation',
    title: 'Navigation',
    type: 'group',
    icon: 'icon-navigation',
    children: [
      // {
      //   id: 'dashboard',
      //   title: 'Dashboard',
      //   type: 'item',
      //   url: '/dashboard',
      //   icon: 'feather icon-home',
      //   classes: 'nav-item'
      // },
      {
        id: 'patients',
        title: 'Patients',
        type: 'item',
        url: '/patients',
        icon: 'feather icon-users',
        classes: 'nav-item'
      },
      
      {
        id: 'rendezvous',
        title: 'Rendez-vous',
        type: 'item',
        url: '/rendezvous',
        icon: 'feather icon-calendar',
        classes: 'nav-item'
      },
      {
        id: 'paiements',
        title: 'Paiements',
        type: 'item',
        url: '/paiements',
        icon: 'feather icon-dollar-sign',
        classes: 'nav-item'
      },
      
      {
        id: 'notes',
        title: 'Notes Médicales',
        type: 'item',
        url: '/notes',
        icon: 'feather icon-file-text'
      },
      {
        id: 'hospitalisations',
        title: 'Hospitalisations',
        type: 'item',
        url: '/hospitalisations',
        icon: 'feather icon-activity'
      }
      
      
    ]
  },
  {
    id: 'personnel-infrastructure',
    title: 'Personnel & Infrastructure',
    type: 'group',
    icon: 'feather icon-briefcase',
    children: [
      {
        id: 'medecins',
        title: 'Médecins',
        type: 'item',
        url: '/medecins',
        icon: 'feather icon-user'
      },
      {
        id: 'infirmiers',
        title: 'Infirmiers',
        type: 'item',
        url: '/infirmiers',
        icon: 'feather icon-users'
      },
      {
        id: 'materiels',
        title: 'Matériels',
        type: 'item',
        url: '/materiels',
        icon: 'feather icon-box' // Change l’icône si tu veux
      },
      
      {
        id: 'chambres',
        title: 'Chambres',
        type: 'item',
        url: '/chambres',
        icon: 'feather icon-home'
      }
    ]
  }
  
// ,  
//   {
//     id: 'ui-element',
//     title: 'UI ELEMENT',
//     type: 'group',
//     icon: 'icon-ui',
//     children: [
//       {
//         id: 'basic',
//         title: 'Component',
//         type: 'collapse',
//         icon: 'feather icon-box',
//         children: [
//           {
//             id: 'button',
//             title: 'Button',
//             type: 'item',
//             url: '/basic/button'
//           },
//           {
//             id: 'badges',
//             title: 'Badges',
//             type: 'item',
//             url: '/basic/badges'
//           },
//           {
//             id: 'breadcrumb-pagination',
//             title: 'Breadcrumb & Pagination',
//             type: 'item',
//             url: '/basic/breadcrumb-paging'
//           },
//           {
//             id: 'collapse',
//             title: 'Collapse',
//             type: 'item',
//             url: '/basic/collapse'
//           },
//           {
//             id: 'tabs-pills',
//             title: 'Tabs & Pills',
//             type: 'item',
//             url: '/basic/tabs-pills'
//           },
//           {
//             id: 'typography',
//             title: 'Typography',
//             type: 'item',
//             url: '/basic/typography'
//           }
//         ]
//       }
//     ]
//   },
//   {
//     id: 'forms',
//     title: 'Forms & Tables',
//     type: 'group',
//     icon: 'icon-group',
//     children: [
//       {
//         id: 'forms-element',
//         title: 'Form Elements',
//         type: 'item',
//         url: '/forms/basic',
//         classes: 'nav-item',
//         icon: 'feather icon-file-text'
//       },
//       {
//         id: 'tables',
//         title: 'Tables',
//         type: 'item',
//         url: '/tables/bootstrap',
//         classes: 'nav-item',
//         icon: 'feather icon-server'
//       }
//     ]
//   },
//   {
//     id: 'chart-maps',
//     title: 'Chart',
//     type: 'group',
//     icon: 'icon-charts',
//     children: [
//       {
//         id: 'apexChart',
//         title: 'ApexChart',
//         type: 'item',
//         url: 'apexchart',
//         classes: 'nav-item',
//         icon: 'feather icon-pie-chart'
//       }
//     ]
//   },
//   {
//     id: 'pages',
//     title: 'Pages',
//     type: 'group',
//     icon: 'icon-pages',
//     children: [
//       {
//         id: 'auth',
//         title: 'Authentication',
//         type: 'collapse',
//         icon: 'feather icon-lock',
//         children: [
//           {
//             id: 'signup',
//             title: 'Sign up',
//             type: 'item',
//             url: '/auth/signup',
//             target: true,
//             breadcrumbs: false
//           },
//           {
//             id: 'signin',
//             title: 'Sign in',
//             type: 'item',
//             url: '/auth/signin',
//             target: true,
//             breadcrumbs: false
//           }
//         ]
//       },
//       {
//         id: 'sample-page',
//         title: 'Sample Page',
//         type: 'item',
//         url: '/sample-page',
//         classes: 'nav-item',
//         icon: 'feather icon-sidebar'
//       },
//       {
//         id: 'disabled-menu',
//         title: 'Disabled Menu',
//         type: 'item',
//         url: 'javascript:',
//         classes: 'nav-item disabled',
//         icon: 'feather icon-power',
//         external: true
//       },
//       {
//         id: 'buy_now',
//         title: 'Buy Now',
//         type: 'item',
//         icon: 'feather icon-book',
//         classes: 'nav-item',
//         url: 'https://codedthemes.com/item/datta-able-angular/',
//         target: true,
//         external: true
//       }
//     ]
//   }
];
