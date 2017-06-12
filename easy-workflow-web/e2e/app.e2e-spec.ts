import { EasyWorkflowWebPage } from './app.po';

describe('easy-workflow-web App', () => {
  let page: EasyWorkflowWebPage;

  beforeEach(() => {
    page = new EasyWorkflowWebPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!!');
  });
});
